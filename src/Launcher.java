import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Bienvenue");
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.nextLine();
        if (input.contentEquals("quit")) {
        } else {
            System.out.println("Unknown command");
        }
    }
}
