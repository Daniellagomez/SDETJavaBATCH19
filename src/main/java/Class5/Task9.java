package Class5;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter current time in 24hr format");
        double newTime= scanner.nextDouble();
        if (newTime>=1 && newTime<=11){
            System.out.println("its the morning");
        } else if (newTime>=12 && newTime<=15) {
            System.out.println("its the afternoon");
        } else if (newTime>=16 && newTime<=20) {
            System.out.println("its the evening");
        } else if (newTime>=21 && newTime<=24) {
            System.out.println("its night time");
        }else {
            System.out.println("invalid input");
        }
    }
}
