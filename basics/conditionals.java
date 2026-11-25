package basics;
import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        int x = sc.nextInt();

        System.out.println("Enter Second Number");
        int y = sc.nextInt();

        if (x > y) {
            System.out.println(x + " is greater than " + y);
        } else if (x < y) {
            System.out.println(x + " is less than " + y);
        } else {
            System.out.println(x + " is equal to " + y);
        }

        sc.close();
    }
}