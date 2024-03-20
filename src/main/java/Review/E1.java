package Review;

import java.util.Scanner;

public class E1 {

    public static void main(String[] args) {
/* we have created a variable of the type int and calling the
nexyint() method to accept the in type data and storing it in the variable

 */

      Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your age");
        int age=scanner.nextInt();

        if (age>50){
            System.out.println("You will get 20% discount on toys");
        }else{
            System.out.println("You will get 10% discount");
        }

    }
}
