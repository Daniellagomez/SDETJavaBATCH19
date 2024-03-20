package Class6;


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter your grades");
        char grade = input.next().toLowerCase().charAt(0);

        switch (grade){
            case 'a':
                System.out.println("A - Excellent");
                break;
            case 'b':
                System.out.println("B - Good");
                break;
            case 'c':
                System.out.println("C - Average");
                break;
            case 'd':
                System.out.println("D - Bad");
                break;
            case 'f':
                System.out.println("F - Failed");
                break;
            default:
                System.out.println("Invalid");

        }

    }
}
