/*
 Aim: WAP to print index of given character ch from inputString.
 */
package Solutions;

import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = new String(scanner.next());
        char ch = scanner.next().charAt(0);
        int indexOfchar = str.indexOf(ch);
        System.out.println(indexOfchar);
    }
}
