package Class5;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the amount of loan needed");
        int loan = scanner.nextInt();
        if(loan<=200000) {
            System.out.println("Approved");
        }else{
            System.out.println("Rejected");
        }

    }
}
