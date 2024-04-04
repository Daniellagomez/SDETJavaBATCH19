package Class13;

public class E1Tester {
    public static void main(String[] args) {
        Task1 t1=new Task1();
        String email= t1.createEmail("John","Snow","Gmail");
        if(email.contains("John")){
            System.out.println("Good");
        }
    }
}
