package basics;

public class decimal {
    public static void main(String[] args) {
        double a = 10.5;
        double b = 20.3;

        double sum = a + b;
        double difference = a - b;
        double product = a * b;
        double quotient = a / b;

        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        System.out.println("The difference of " + a + " and " + b + " is: " + difference);
        System.out.println("The product of " + a + " and " + b + " is: " + product);
        System.out.println("The quotient of " + a + " and " + b + " is: " + quotient);
    }
}
