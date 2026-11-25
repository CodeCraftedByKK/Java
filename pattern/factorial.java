package pattern;
import java.util.Scanner;

public class factorial{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a Number: ");
    double x = sc.nextInt();

    double fact = 1;

    for(int i=1; i<=x; i++ ){
        fact = fact * i;
    }

    System.out.println(fact);


    sc.close();

}
}