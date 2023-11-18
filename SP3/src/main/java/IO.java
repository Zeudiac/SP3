import java.util.Scanner;

public interface IO {
    Scanner scanner = new Scanner(System.in);

    default String getInput(String msg) {
        System.out.print(msg);
        return scanner.nextLine();
    }

    default void displayMessage(String msg) {
        System.out.println(msg);
    }
}
