package method;
import java.util.Scanner;

public class function {
    public static void main(String[] args){
        // function for power

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Base: ");
        int base = sc.nextInt();

        System.out.println("Enter Power: ");
        int power = sc.nextInt();

        int pow = 1;

        for(int i=1; i<=power; i++){
            pow = pow * base;
        }

        System.out.println(pow);









        sc.close();
    }
}
