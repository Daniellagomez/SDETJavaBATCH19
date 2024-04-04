package Class12;
/*
Create a String that should be a combination of letters,
numbers and special characters.Find out how many
Alphabet characters are there in the String.
 */
public class Task2 {
    public static void main(String[] args) {
        String str="jabdioANCUTOQBdbo27648bfc$%^&";
        System.out.println(str.replaceAll("^A-Za-z",""));

    }
}
