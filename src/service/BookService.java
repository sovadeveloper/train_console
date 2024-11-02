package service;

import model.Book;

public class BookService {

    public void createBook(String name, int pageCount, int number) {
        if (name.length() == 0) {
            System.out.println("Длина названия книги не может быть меньше либо равна 0");
            return;
        }
        if (pageCount <= 0) {
            System.out.println("Количество страниц должно быть больше 0");
            return;
        }
        if (number <= 0) {
            System.out.println("Номер тома должен быть больше 0");
            return;
        }
        Book newBook = new Book(name, pageCount, number);
        System.out.println(newBook);
    }
}
