package Class9;

public class E4Array {

    public static void main(String[] args) {
// write a program to calculate the average of these numbers
        // first add all the numbers and then divide by the output
        int [] numbers={10,25,45,66,85,100};
        int sum=0;
        for (int i=0; i< numbers.length; i++){
            sum=sum+numbers[i];

        }
        System.out.println(sum/ numbers.length);
        }
    }

