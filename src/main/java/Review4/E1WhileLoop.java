package Review4;

public class E1WhileLoop {
    public static void main(String[] args) {
        String name="Josh";
        while (name.equals("Josh")){
            System.out.println("Hello Java");
            name="Matt";
        }
    }
}
/*
without the name=matt the code will execute infinitely
 */