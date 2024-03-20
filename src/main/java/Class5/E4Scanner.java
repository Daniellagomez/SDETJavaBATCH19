package Class5;

import java.util.Scanner;

public class E4Scanner {

    /*
    scanner.next is for 1 word
    scanner.nextln is for longer lines or sentences
     */

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scanner.nextLine();
        System.out.println(name);
    }
}
