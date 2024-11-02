package console.handler;

import service.BookService;

import java.util.Scanner;

public class BookConsoleHandler {

    private final Scanner scanner;
    private final BookService bookService = new BookService();

    public BookConsoleHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public void submenuFrotress() {
        System.out.println("1. Легкий");
        System.out.println("2. Средний");
        System.out.println("3. Крепкий");
    }

    public String choiceFrotress() {
        int choice = scanner.nextInt();
        String frotress = null;
        if (choice == 1) {
            frotress = "Легкий";
        }
        if (choice == 2) {
            frotress = "Средний";
        }
        if (choice == 3) {
            frotress = "Крепкий";
        }
        return frotress;
    }

    public void startMenu() {
        System.out.println("1. Создать новую книгу");
        System.out.println("2. Вернуться в главное меню");
    }

    public void handle() {
        while (true) {
            String choice = scanner.nextLine();
            switch (choice.toLowerCase()) {
                case "1" -> {
                    System.out.println("Выберите крепость");
                    submenuFrotress();
                    String frotress = choiceFrotress();
                    if (frotress == null) {
                        return;
                    }
                    System.out.println(frotress);
                    System.out.println("Введите название книги");
                    String nameFromUser = scanner.nextLine();
                    System.out.println("Введите количество страниц");
                    int pageCountFromUser = scanner.nextInt();
                    System.out.println("Введите номер книги (том)");
                    int numberFromUser = scanner.nextInt();
                    bookService.createBook(nameFromUser, pageCountFromUser, numberFromUser);
                }
                case "2" -> {
                    return;
                }
                default -> {
                    return;
                }
            }
        }
    }
}
