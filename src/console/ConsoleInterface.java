package console;

import console.handler.BookConsoleHandler;
import console.handler.NewspaperConsoleHandler;

import java.util.Scanner;

public class ConsoleInterface {

    private Scanner scanner = new Scanner(System.in);
    BookConsoleHandler bookConsoleHandler = new BookConsoleHandler(scanner);
    NewspaperConsoleHandler newspaperConsoleHandler = new NewspaperConsoleHandler(scanner);

    public void applicationStart() {
        while (true) {
            mainMenu();
            int i = scanner.nextInt();
            if (i == 1) {
                bookConsoleHandler.startMenu();
                scanner.nextLine();
                bookConsoleHandler.handle();
            }
            if (i == 2) {
                newspaperConsoleHandler.startMenu();
                scanner.nextLine();
                newspaperConsoleHandler.handler();
            }
            if (i == 3) {
                System.exit(1);
            }
        }
    }

    private void mainMenu() {
        System.out.println("1. Книги");
        System.out.println("2. Газеты");
        System.out.println("3. Выход");
    }
}
