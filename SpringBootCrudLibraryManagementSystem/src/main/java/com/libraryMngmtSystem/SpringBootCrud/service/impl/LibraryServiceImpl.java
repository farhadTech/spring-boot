package com.libraryMngmtSystem.SpringBootCrud.service.impl;

import com.libraryMngmtSystem.SpringBootCrud.model.Book;
import com.libraryMngmtSystem.SpringBootCrud.repository.BookRepository;
import com.libraryMngmtSystem.SpringBootCrud.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryServiceImpl implements LibraryService {

    private final BookRepository bookRepository;

    @Autowired
    public LibraryServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public int getTotalBooks() {
        return (int) bookRepository.count();
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found with id: " + id));
    }

    @Override
    public void addBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void updateBook(Long id, Book updatedBook) {
        Book existingBook = getBookById(id);
        existingBook.setTitle(updatedBook.getTitle());
//        existingBook.setAuthor(updatedBook.getAuthor());
//        existingBook.setPublicationYear(updatedBook.getPublicationYear());
        bookRepository.save(existingBook);
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
