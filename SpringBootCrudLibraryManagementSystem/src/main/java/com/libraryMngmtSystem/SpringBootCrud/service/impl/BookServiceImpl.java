package com.libraryMngmtSystem.SpringBootCrud.service.impl;

import com.libraryMngmtSystem.SpringBootCrud.model.Book;
import com.libraryMngmtSystem.SpringBootCrud.repository.BookRepository;
import com.libraryMngmtSystem.SpringBootCrud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found with ID: " + id));
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book updateBook(Long id, Book updatedBook) {
        Book existingBook = getBookById(id); // Retrieve existing book or throw exception if not found
        existingBook.setTitle(updatedBook.getTitle());
//        existingBook.setAuthor(updatedBook.getAuthor());
//        existingBook.setGenre(updatedBook.getGenre());
//        existingBook.setPublicationYear(updatedBook.getPublicationYear());
        return bookRepository.save(existingBook);
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
