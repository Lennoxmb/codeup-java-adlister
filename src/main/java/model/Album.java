package model;

public class Album {
    private int id;
    private String name;
    private String artist;
    private int year;
    private String genre;
    private String cover;

    public Album(int id, String name, String artist, int year, String genre, String cover) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.year = year;
        this.genre = genre;
        this.cover = cover;
    }

    public Album(String name, String artist, int year, String genre, String cover) {
        this.name = name;
        this.artist = artist;
        this.year = year;
        this.genre = genre;
        this.cover = cover;
    }

    public Album() {
        this.id = 0;
        this.name = "";
        this.artist = "";
        this.year = 0;
        this.genre = "";
        this.cover = "";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getCover() {
        return cover;
    }

    public void setId(int id) {
        this.id = id;
    }
}
