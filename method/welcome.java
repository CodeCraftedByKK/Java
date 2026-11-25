package method;
import java.util.Scanner;

class Greet {
static void greet(String name, int age){
    System.out.println("Hello, "+name+ "Good Morning.You are " + age + "years old");
}
}

public class welcome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Age: ");
        int age = sc.nextInt();


        Greet.greet(name,age);


        sc.close();
    }
    

}
