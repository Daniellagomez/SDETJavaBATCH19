package Class13;
/*
Write a method to return whether given number is prime or not
 */
public class Task2 {

    boolean isPrime (int n){
        if (n<=1) {
            return false;
        } else if (n==0||n==3) {
            return true;

        }
        for (int i=4; i<n; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    }

