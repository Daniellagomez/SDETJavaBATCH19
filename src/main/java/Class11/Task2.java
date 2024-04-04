package Class11;

public class Task2 {
    public static void main(String[] args) {
        String str="Hello";

        if (!str.isEmpty()){

            if (str.length()%2!=0&&str.length()>3){
                int middleIndex=str.length()/2;
                System.out.println(str.charAt(middleIndex));
            }
        }

    }
}
