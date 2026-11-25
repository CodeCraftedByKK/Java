package array;
import java.util.Scanner;


public class sumAverage {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            System.out.println("Enter Elements " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for(int i=0; i<size; i++){
            sum = sum + arr[i];
        }

        double avg = sum/size;

        System.out.println("Sum of the given array is "+ sum );
        System.out.println("Avg of given array : " + avg );





        sc.close();
    }
    
}
