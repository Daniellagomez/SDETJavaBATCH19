package Class6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        System.out.println("please enter two numbers and the operator");
        double num1= Scanner.nextDouble();
        double num2= Scanner.nextDouble();
        char operator=Scanner.next().charAt(0);
        switch (operator){
            case '+':
                System.out.println("The result for the + operator is "+(num1 + num2));
                break;
            case '-':
                System.out.println("The result for the - operator is "+(num1 - num2));
                break;
            case '*':
                System.out.println("The result for the * operator is "+(num1 * num2));
                break;
            case '/':
                System.out.println("The result for the / operator is "+(num1 / num2));
                break;
            default:
                System.out.println("Wrong operator");
        }
    }
}
