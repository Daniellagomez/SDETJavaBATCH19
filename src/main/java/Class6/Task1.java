package Class6;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the name of your country");
        String country= scanner.nextLine();

        switch (country){
            case "USA":
                System.out.println("We speak English");
                break;
            case "Colombia":
                System.out.println("We speak Spanish");
                break;
            case "Japan":
                System.out.println("We speak Japanese");
                break;
            case "Russia":
                System.out.println("We speak Russian");
                break;
            case "Egypt":
                System.out.println("We speak Arabic");
                break;
            default:
                System.out.println("Country not supported");
        }
    }
}
