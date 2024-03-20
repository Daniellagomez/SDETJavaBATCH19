package Review2;

public class Task1 {


    public static void main(String[] args) {

        boolean degree=true;
        double gpa=3.5;

        if (degree){
            System.out.println("congratulations");
            if (gpa>=3.5) {
                System.out.println("You are eligible for a scholarship");
            }else{
                System.out.println("You should have studied harder");
            }
        }else{

            System.out.println("You should get a degree");
        }

    }
    }
