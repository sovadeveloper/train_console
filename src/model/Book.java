package model;

public class Book {

    private String name;

    private int pageCount;

    private int number;

    public Book() {
    }

    public Book(String name, int pageCount, int number) {
        this.name = name;
        this.pageCount = pageCount;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pageCount=" + pageCount +
                ", number=" + number +
                '}';
    }
}
