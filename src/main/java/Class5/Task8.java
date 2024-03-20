package Class5;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int number= scanner.nextInt();
        if (number>=11 && number<=10){
            System.out.println("this number is small");
        } else if (number>=11 && number<=100) {
            System.out.println("this number is medium");
        } else if (number>=101 && number<=1000) {
            System.out.println("this number is large");
        }
    }
}
