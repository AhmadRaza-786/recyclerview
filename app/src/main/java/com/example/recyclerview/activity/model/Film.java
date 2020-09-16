package com.example.recyclerview.activity.model;

public class Film {
    private String titleFilm;
    private String genre;
    private String year;

    public  Film() {

    }

    public Film(String titleFilm, String genre, String year) {
        this.titleFilm = titleFilm;
        this.genre = genre;
        this.year = year;
    }

    public String getTitleFilm() {
        return titleFilm;
    }

    public void setTitleFilm(String titleFilm) {
        this.titleFilm = titleFilm;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
