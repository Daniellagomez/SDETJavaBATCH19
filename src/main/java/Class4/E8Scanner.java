package Class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scan.nextLine();
        System.out.println("Please enter your age");
        int age= scan.nextInt();
        System.out.println("please enter your salary");
        double salary= scan.nextDouble();
        System.out.println("My name is "+name+" My age is "+age+" My salary "+salary);
    }
}
