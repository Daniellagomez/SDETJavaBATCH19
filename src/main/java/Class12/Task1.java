package Class12;

/*
Create a string that will hold a sentence.
Write a program to get a new String without any space from above string
 */

public class Task1 {
    public static void main(String[] args) {
        String str="Java is very easy ";
        String newString=str.replaceAll(" ","");
        System.out.println(newString);
        System.out.println(str.replaceAll(" ",""));


    }
}
