package pattern;
import java.util.Scanner;

public class ascii {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

   for(int i=65; i<=90; i++){
    System.out.println(i + " " + (char)i );
   }


   for(int i=97; i<=123; i++){
    System.out.println(i + " " + (char)i );
   }







    sc.close();
}



}
