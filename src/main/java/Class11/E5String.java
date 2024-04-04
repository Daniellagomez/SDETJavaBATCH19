package Class11;

public class E5String {
    public static void main(String[] args) {

        String st= "Matt likes Watermelon. He is in the kitchen again";
        System.out.println(st.contains("Matt"));
        System.out.println("Viet");

        System.out.println(st.toLowerCase().contains("matt likes watermrlon"));
        System.out.println(st.startsWith("M"));
        System.out.println(st.endsWith("again"));
    }
}
