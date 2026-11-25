package basics;

import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = (double) a / b;

        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        System.out.println("The difference of " + a + " and " + b + " is: " + difference);
        System.out.println("The product of " + a + " and " + b + " is: " + product);
        System.out.println("The quotient of " + a + " and " + b + " is: " + quotient);

        sc.close();
    }
}
