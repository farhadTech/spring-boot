package com.libraryMngmtSystem.SpringBootCrud.service;

import com.libraryMngmtSystem.SpringBootCrud.model.Book;

import java.util.List;

public interface LibraryService {
    int getTotalBooks();
    List<Book> getAllBooks();
    Book getBookById(Long id);
    void addBook(Book book);
    void updateBook(Long id, Book updatedBook);
    void deleteBook(Long id);
}
