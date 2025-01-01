package com.libraryMngmtSystem.SpringBootCrud.controller;

import com.libraryMngmtSystem.SpringBootCrud.model.Book;
import com.libraryMngmtSystem.SpringBootCrud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // Endpoint to handle adding a new book
    @PostMapping("/add")
    public ResponseEntity<String> addBook(@RequestBody Book book) {
        bookService.addBook(book); // Save the book to the database
        return ResponseEntity.ok("Added successfully."); // Redirect back to the home page
    }

    // Endpoint to get a book by ID
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Book book = bookService.getBookById(id);
        return ResponseEntity.ok(book); // Return to the home page
    }

    // Endpoint to get all books
    @GetMapping
    public String getAllBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "home"; // Return to the home page
    }

    // Endpoint to update a book
    @PostMapping("/update/{id}")
    public String updateBook(@PathVariable Long id, @ModelAttribute Book book, Model model) {
        Book updatedBook = bookService.updateBook(id, book);
        if (updatedBook != null) {
            model.addAttribute("updateMessage", "Book updated successfully!");
        } else {
            model.addAttribute("updateMessage", "Book not found for update.");
        }
        return "home"; // Return to the home page
    }

    // Endpoint to delete a book by ID
    @PostMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id, Model model) {
        try {
            bookService.deleteBook(id);
            model.addAttribute("deleteMessage", "Book deleted successfully!");
        } catch (Exception e) {
            model.addAttribute("deleteMessage", "Error deleting book: " + e.getMessage());
        }
        return "home";
    }
}
