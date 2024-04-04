package Review6;
/*
Create a method which will take a number as input
and it is going to print all the numbers starting
from 0 until that number.
 */
public class E10Methods {
    void printNumbers(int num){

        for (int i = 0; i < num; i++) {
            System.out.println(i);

        }
    }

    public static void main(String[] args) {
        E10Methods e=new E10Methods();
       e.printNumbers(5);
    }

}
