package com.libraryMngmtSystem.SpringBootCrud.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;

    @Column(nullable = false, unique = true)
    private String isbn;

    @Column(nullable = false)
    private String title;

////    @ManyToOne
//    @JoinColumn(name = "authorId", referencedColumnName = "authorId")
//    private Author author;
//
//    private Integer publicationYear;
//
//    @ManyToOne
//    @JoinColumn(name = "genreId", referencedColumnName = "genreId")
//    private Genre genre;
//
//    public Book() {
//    }

    public Book(Integer bookId, String isbn, String title) {
        this.bookId = bookId;
        this.isbn = isbn;
        this.title = title;
//        this.author = author;
//        this.publicationYear = publicationYear;
//        this.genre = genre;
    }

    public Book() {

    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public Author getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(Author author) {
//        this.author = author;
//    }
//
//    public Integer getPublicationYear() {
//        return publicationYear;
//    }
//
//    public void setPublicationYear(Integer publicationYear) {
//        this.publicationYear = publicationYear;
//    }
//
//    public Genre getGenre() {
//        return genre;
//    }
//
//    public void setGenre(Genre genre) {
//        this.genre = genre;
//    }
}
