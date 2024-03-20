package Class5;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your height in inches");
        double height = input.nextDouble();
        if (height<60){
            System.out.println("you are short");
        } else if (height>=60 && height <=72) {
            System.out.println("You are medium height");

        } else if (height > 72) {
            System.out.println("you are tall");

        }else {
            System.out.println("Enter your number");
        }
    }
}
