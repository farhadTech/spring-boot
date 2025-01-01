package com.libraryMngmtSystem.SpringBootCrud.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer genreId;

    @Column(nullable = false)
    private String genreName;

    public Genre() {
    }

    public Genre(Integer genreId, String genreName) {
        this.genreId = genreId;
        this.genreName = genreName;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }
}
