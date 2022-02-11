import java.util.Scanner;

public class Launcher{
    public static void main(String[] args) {
        System.out.println("Bienvenue");
        Scanner inputScanner = new Scanner(System.in);
        Integer check = 0;
        while (check.equals(0)) {
            String input = inputScanner.nextLine();
            if (!(input.equals("quit"))) {
                if (input.equals("fibo")) {
                    System.out.println("n value :");
                    String inputfibo = inputScanner.nextLine();
                    int n = Integer.parseInt(inputfibo);
                    System.out.println(fibo(n));
                } else {
                System.out.println("Unknown command");
                }
            } else {
            check = 1;
            }
        }
    }
    public static int fibo (int n) {
        int res = 0;
        int val1 = 0;
        int val2 = 1;
        while (n > 1) {
            res = val1 + val2;
            val1 = val2;
            val2 = res;
            n = n - 1;
        }
        return res;
    }
}