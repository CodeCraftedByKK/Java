package basics;
import java.util.Scanner;

public class divby5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int x = sc.nextInt();

        if(x%5==0){
            System.out.println("The Number is divisible by 5");
        }





        sc.close();

    }
}