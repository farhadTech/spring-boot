package com.libraryMngmtSystem.SpringBootCrud.repository;


import com.libraryMngmtSystem.SpringBootCrud.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    // Find authors by name
    List<Author> findByAuthorName(String authorName);
}
