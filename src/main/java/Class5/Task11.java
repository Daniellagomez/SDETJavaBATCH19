package Class5;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your Quiz scores");
        double quiz=scanner.nextDouble();
        System.out.println("Enter your Mid term scores");
        double midterm=scanner.nextDouble();
        System.out.println("Enter your final scores");
        double finalScores= scanner.nextDouble();
        double averageScore=(quiz+midterm+finalScores)/3;
        if (averageScore>=90) {
            System.out.println("Your grade is A");
        } else if (averageScore>=70){
            System.out.println("Your score is a B");
        } else if (averageScore>=50){
            System.out.println("Your grade is a C");
        }else{
            System.out.println("Your grade is F");
        }
    }
}
