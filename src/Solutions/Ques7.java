package Solutions;

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringInput = scanner.nextLine();
        int lengthOfString = stringInput.length();
        int totalWeight = 0;
        System.out.printf("totalWeight = ");

        for (int i = 0; i < lengthOfString; i++) {
            int weightOfChar = (int) stringInput.charAt(i);
            totalWeight = totalWeight + weightOfChar;
            System.out.print(weightOfChar + " + ");
        }

    }
}
