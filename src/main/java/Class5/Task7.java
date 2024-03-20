package Class5;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the day number");
        int day= scanner.nextInt();
        if(day==1|| day==2|| day==3|| day==4|| day==5){
            System.out.println("Its a weekday");
        } else if (day==6|| day==7) {
            System.out.println("its a weekend");
        }else {
            System.out.println("Invalid day");

        }
    }
}
