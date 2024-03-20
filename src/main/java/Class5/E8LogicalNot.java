package Class5;

public class E8LogicalNot {

    public static void main(String[] args) {

        boolean box=false;
        box=!box;
        System.out.println(box);

        String country="Spain";
        if (!country.equals("Iran")) {
            System.out.println("You can visit USA");
        }else{
            System.out.println("not allowed");
        }
    }
}
