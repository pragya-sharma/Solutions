package Solutions;
import java.util.Scanner;
public class Ques1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.printf("index:" + " ");
        for (int i = 0; i < s.length(); i++) {
            // System.out.println("index :"+" ");
            System.out.printf("%d\t", i);
        }
        System.out.printf("\n");
        System.out.printf("chars:" + " ");
        char ch[] = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.printf("%c\t", ch[i]);
        }
    }
}