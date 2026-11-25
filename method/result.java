package method;
import java.util.Scanner;

class displayresult{
    static void display(String name, int marks1, int marks2,int marks3,int marks4, int marks5, int roll1){
        System.out.println("Hello, " + name + " Good Mornnig "  + " Welcome in Result Section ");
        System.out.println("Your Result are : ");
       
    }
}

public class result {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Name: ");
        String name1 = sc.nextLine();

        System.out.println("Enter Roll No. ");
        int roll1 = sc.nextInt();

        System.out.println("Enter English Marks: ");
        int marks1 = sc.nextInt();


        System.out.println("Enter Maths Marks: ");
        int marks2 = sc.nextInt();

        System.out.println("Enter Science Marks: ");
        int marks3 = sc.nextInt();


        System.out.println("Enter IT Marks: ");
        int marks4 = sc.nextInt();


        System.out.println("Enter Digital Marks: ");
        int marks5 = sc.nextInt();


        // int total = marks1 + marks2 + marks3+ marks4+ marks5;

        // double avg = total / 5; 

        
        displayresult.display(name1, marks1, marks2,
                marks3, marks4, marks5, roll1);
        



        sc.close();
    }
}
