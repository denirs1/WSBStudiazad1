package com.example.zadaniejeden.model;

import javax.persistence.*;
import java.util.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String genre;
    private String ismn;
    private String year;

    public Song() {
    }
    public Song(String title, String genre, String ismn, String year) {
        this.title = title;
        this.genre = genre;
        this.ismn = ismn;
        this.year = year;
    }
    public Song(String title, String genre, String ismn, String year, Set<Artist> artists) {
        this.title = title;
        this.genre = genre;
        this.ismn = ismn;
        this.year = year;
        this.artists = artists;
    }

    @ManyToMany
    private Set<Artist> artists = new HashSet<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getIsmn() {
        return ismn;
    }

    public void setIsmn(String ismn) {
        this.ismn = ismn;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Set<Artist> getArtists() {
        return artists;
    }

    public void setArtists(Set<Artist> artists) {
        this.artists = artists;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", ismn='" + ismn + '\'' +
                ", year='" + year + '\'' +
                '}';
    }


}
