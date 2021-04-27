package introduction;

import java.util.Scanner;

public class IfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();

        String result = "Weird";

        if(n % 2 == 0) {
            if(n > 20) {
                result = "Not Weird";
            } else {
                if(n >= 2 && n <= 5) {
                    result = "Not Weird";
                }
            }
        }

        System.out.println(result);

        scanner.close();
    }
}