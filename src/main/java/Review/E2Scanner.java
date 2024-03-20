package Review;

import java.util.Scanner;

public class E2Scanner {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your grade");
        /*
        we are calling the next method form the scanner class
        and on top of that we are calling the charAt() method so that we can only pick the first
        letter of the word and ignore the rest if the user tries to enter more letters
         */
        char grade=scanner.next().charAt(0);

        switch (grade){

            case 'A':
                System.out.println("Very good grade");
                break;
            case 'B':
                System.out.println("Good grade");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Very bad grade");
                break;
            case 'F':
                System.out.println("You failed and need to try again");
                break;
            default:
                System.out.println("Wrong grade entered");

        }
    }
}
