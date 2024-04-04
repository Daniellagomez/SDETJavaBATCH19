package Class15;
/*
create a method that will accept a String as a parameter and return
a new String that consists of only vowels. Method should be available
inside the class only where it was declared
and executed by calling its name
 */
public class Task3 {
    private static String vowels(String str){
        return str.replaceAll("[^aeiouAEIOU]","");


    }


    public static void main(String[] args) {

        System.out.println("hello");
    }



}
