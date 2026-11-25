package array;
import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            System.out.println("Enter Element " + (1+i) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Elements are: ");

        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        }




        sc.close();
    }
    
}
