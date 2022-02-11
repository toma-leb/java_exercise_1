import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Launcher{
    public static void main(String[] args) {
        System.out.println("Bienvenue");
        Scanner InputScanner = new Scanner(System.in);
        Integer check = 0;
        while (check.equals(0)) {
            String input = InputScanner.nextLine();
            if (!(input.equals("quit"))) {
                if (input.equals("fibo")) {
                    System.out.println("n value :");
                    String inputFibo = InputScanner.nextLine();
                    int n = Integer.parseInt(inputFibo);
                    System.out.println(fibo(n));
                }
                else if (input.equals("freq")) {
                    System.out.println("path :");
                    String pathStr = InputScanner.nextLine();
                    Path filePath = Paths.get(pathStr);
                    try {
                        String fileContent = java.nio.file.Files.readString(filePath);
                        freq(fileContent);
                    } catch (IOException e) {
                        System.out.println("Unreadable file: IOException " + e.getMessage());
                    }
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
    public static void freq (String fileContent) {
        String[] words = fileContent.replace("[^a-zA-Z]","").toLowerCase().split(" ");
        String res = "";
        ArrayList<Integer> freqs = new ArrayList<Integer>();
        for (int i = 0; i < words.length - 1; i ++) {
            int count = 0;
            for (int j = i + 1; j < words.length - 2; j ++) {
                if (words[i].equals(words[j])) {
                    count += 1;
                }
            }
            freqs.add(count);
        }
        for (int i = 0; i < 3; i ++) {
            Integer maxFreqs = Collections.max(freqs);
            Integer indice = freqs.indexOf(maxFreqs);
            freqs.remove(maxFreqs);
            res += words[indice] + " ";
        }
        System.out.println(res);
    }
}