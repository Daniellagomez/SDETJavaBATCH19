package Review;

import java.util.Scanner;

public class E3Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scan.nextLine();
        System.out.println("Please enter your favorite color");
        String color = scan.nextLine();
        System.out.println(name + " " + color);

        if (color.equalsIgnoreCase("Blue")) {

           if (name.equalsIgnoreCase("Ana")){
               System.out.println("I am a very good driver");
           }else{
               System.out.println("Ia m Will");
           }
        }else{
            System.out.println("You are very boring");
        }
    }
}
