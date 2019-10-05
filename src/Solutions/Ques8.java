package Solutions;

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String :");
        String stringInput = s.nextLine();

        int upperCasrWeight = 0;
        for (int i = 0; i < stringInput.length(); i++) {
            if (stringInput.charAt(i) >= 'A' && stringInput.charAt(i) <= 'Z') {
                upperCasrWeight += (int) stringInput.charAt(i);
            }
        }

        System.out.println("UpperCaseWeight of input String :" + upperCasrWeight);
    }
}
