package Class11;

public class E15String {
    public static void main(String[] args) {
        String str="Matt you still have time run away. Listen to me only. Every one else is lying";
        String [] sentences=str.split("[.]");
        System.out.println(sentences.length);
        System.out.println(sentences[1].trim());
    }
}
