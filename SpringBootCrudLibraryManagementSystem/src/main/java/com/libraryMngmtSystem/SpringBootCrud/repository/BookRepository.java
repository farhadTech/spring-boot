package com.libraryMngmtSystem.SpringBootCrud.repository;


import com.libraryMngmtSystem.SpringBootCrud.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    // Find books by title
    List<Book> findByTitle(String title);
}
