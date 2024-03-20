package Class4;

import java.util.Scanner;

public class E6Scanner {

    public static void main(String[] args) {
     // new Scanner(System.in); creating the object
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please Enter your age");
        int age=scanner.nextInt();
        System.out.println("You are "+age+" years old");

    }
}
