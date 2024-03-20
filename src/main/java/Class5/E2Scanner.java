package Class5;

import java.util.Scanner;

public class E2Scanner {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a byte number");
        byte smallBox= scanner.nextByte();
        System.out.println("Please enter a double number");
        double biggerBox= scanner.nextDouble();
        System.out.println("Please enter a Boolean variable");
        boolean logicalBox= scanner.hasNextBoolean();

        System.out.println(smallBox);
        System.out.println(biggerBox);
        System.out.println(logicalBox);


    }
}
