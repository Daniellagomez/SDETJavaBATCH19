package Class11;

public class E12String {
    public static void main(String[] args) {
        String str="bvhjdfbvdikfUSAIDDh38r84903u!!%@#R%@";
        System.out.println(str.replaceAll("[0-9]","*"));
        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[A-Z]","[]"));
        System.out.println(str.replaceAll("[A-z]",""));
        System.out.println(str.replaceAll("[A-Z0-9]",""));
        System.out.println(str.replaceAll("[A-Za-z0-9]",""));
        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));



    }
}
