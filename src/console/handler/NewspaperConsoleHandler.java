package console.handler;

import service.NewspaperService;

import java.time.LocalDate;
import java.util.Scanner;

public class NewspaperConsoleHandler {

    private final Scanner scanner;

    private final NewspaperService newspaperService = new NewspaperService();

    public NewspaperConsoleHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public void startMenu() {
        System.out.println("1. Создать новую газету");
        System.out.println("2. Вернуться в главное меню");
    }

    public void handler() {
        while (true) {
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("1")) {
                System.out.println("Введите название газеты");
                String nameFromUser = scanner.nextLine();
                System.out.println("Введите номер газеты");
                int numberFromUser = scanner.nextInt();
                System.out.println("Введите дату выхода газеты");
                scanner.nextLine();
                LocalDate releaseDateFromUser = LocalDate.parse(scanner.next());
                newspaperService.createNewspaper(nameFromUser, numberFromUser, releaseDateFromUser);
            } else if (choice.equalsIgnoreCase("2")) {
                return;
            } else {
                return;
            }
        }
    }
}
