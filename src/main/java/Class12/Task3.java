package Class12;
/*
You have a string a="Is it saturday? Is it raining? Do we have class today?"
how would you find out how many sentences are in that String
 */
public class Task3 {
    public static void main(String[] args) {
        String str="Is it saturday? Is it raining? Do we have class today?";
        System.out.println(str.split("[?]").length);

    }
}
