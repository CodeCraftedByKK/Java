package pattern;
import java.util.Scanner;
public class reverse {
    public static void main (String[] args){
        
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Number: ");
    int x = sc.nextInt();

    int last;
    int r=0;



    while(x!=0){
       last = x % 10;
       r = r * 10;
       r = r + last;
       x = x/10;

        
    }

    System.out.println(r);








    sc.close();

        
    }
}
