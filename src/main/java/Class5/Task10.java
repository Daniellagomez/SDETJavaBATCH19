package Class5;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your birth Month");
        String month= scanner.nextLine();
        switch (month){
            case ("March"):
            case ("April"):
            case ("May"):
                System.out.println("you were born in spring");
                break;
            case ("June"):
            case ("July"):
            case("August"):
                System.out.println("you were born in summer");
                break;
            case ("September"):
            case ("October"):
            case("November"):
            case("December"):
                System.out.println("you were born in Winter");
                break;
            default:
                System.out.println("invalid month");
        }
    }
}
