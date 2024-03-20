package Class9;

public class E5Array {

    public static void main(String[] args) {
//calculate the avg of numbers using the enhance for loop
        int [] numbers={10,25,45,66,85,100};
        int sum=0;
        for (int n:numbers){
                sum=sum+n;
                // shorthand op sum+=n
            }
        System.out.println(sum/ numbers.length);
        }

        }


