package Review;

public class E5LogicalOp {

    public static void main(String[] args) {

        /*
        If someone is less than 10 years old or
        someone is older than 50 give 20% discount
         */
        int age=10;
        if (age<10 || age>50){
            System.out.println("you will get 20% discount");
        }else{
            System.out.println("No discount");
        }
    }
}
