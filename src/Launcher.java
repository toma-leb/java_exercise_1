import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Bienvenue");
        Scanner inputScanner = new Scanner(System.in);
        Integer check = 0;
        while (check.equals(0)) {
            String input = inputScanner.nextLine();
            if (!(input.equals("quit"))){
                System.out.println("Unknown command");
            }
            else {
                check = 1;
            }
        }
    }
}