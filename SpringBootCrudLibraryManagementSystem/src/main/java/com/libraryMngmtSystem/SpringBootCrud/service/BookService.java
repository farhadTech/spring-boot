package com.libraryMngmtSystem.SpringBootCrud.service;

import com.libraryMngmtSystem.SpringBootCrud.model.Book;
import java.util.List;

public interface BookService {

    // Add a new book
    Book addBook(Book book);

    // Get a book by its ID
    Book getBookById(Long id);

    // Get all books
    List<Book> getAllBooks();

    // Update a book
    Book updateBook(Long id, Book book);

    // Delete a book by ID
    void deleteBook(Long id);
}
