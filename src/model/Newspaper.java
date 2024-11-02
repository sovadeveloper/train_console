package model;

import java.time.LocalDate;

public class Newspaper {

    private String name;

    private int number;

    private LocalDate releaseDate;

    public Newspaper() {
    }

    public Newspaper(String name, int number, LocalDate releaseDate) {
        this.name = name;
        this.number = number;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
