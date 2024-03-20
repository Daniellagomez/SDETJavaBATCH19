package Class5;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner ScannerCity=new Scanner(System.in);
        Scanner ScannerTemp=new Scanner(System.in);
        System.out.println("Please enter your city");
        String city= ScannerCity.nextLine();
        System.out.println("What is the temperature in your city in F");
        Double temperatureF= ScannerTemp.nextDouble();
        //Convert Fahrenheir to celsius
        Double temperatureC=(temperatureF - 32)* 5.0/9.0;
        System.out.println("The temperature in the city is "+temperatureC);

    }
}
