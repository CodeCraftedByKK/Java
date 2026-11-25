package pattern;
import java.util.Scanner;

public class productdigit {
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        int product = 1;
        int num;

        while(n!=0){
            num = n % 10;
            product = product * num; 
            n = n / 10;

        }

        System.out.println(product);





        sc.close();

    }
    
}
