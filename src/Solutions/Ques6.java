package Solutions;

import java.util.Scanner;
public class Ques6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter String Value : ");
        String stringInput = scanner.nextLine();

        stringInput = stringInput.toLowerCase();
        System.out.println("Lowered Case : " + stringInput);

    }
}


