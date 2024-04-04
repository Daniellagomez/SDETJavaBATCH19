package Class11;
// '^' is the same as '!' operator
public class E13String {
    public static void main(String[] args) {
        String str="ajbfoufhaoibdc1243985!@^**@&";
        System.out.println(str.replaceAll("[^a-z]",""));
        System.out.println(str.replaceAll("[^a-z0-9]",""));
    }
}
