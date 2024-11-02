package service;

import model.Newspaper;

import java.time.LocalDate;

public class NewspaperService {

    public void createNewspaper(String name, int number, LocalDate releaseDate) {
        if (name.length() == 0) {
            System.out.println("Длина названия газеты не может быть меньше либо равно 0");
            return;
        }
        if (number <= 0) {
            System.out.println("Номер газеты должен быть больше 0");
        }
        if (releaseDate.isAfter(LocalDate.now())) {
            System.out.println("Книга не может быть выпущена позже текущей даты");
        }
        Newspaper newNewspaper = new Newspaper(name, number, releaseDate);
        System.out.println(newNewspaper);
    }
}
