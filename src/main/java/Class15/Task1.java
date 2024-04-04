package Class15;
/*
Create a method that wil accept an array as parameters and will
return a sum of all elements from that array. Method should be
visible only within the same package and accessible by creating
an instance/object of the class
 */
public class Task1 {

    int sumArray(int [] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum;

    }

}
