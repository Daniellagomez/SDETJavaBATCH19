package Class11;

public class E8String {
    public static void main(String[] args) {
        String str="Matt is going to regret this soon";
        System.out.println(str.charAt(2));
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='t'||str.charAt(i)=='T'){
                count++;
            }
        }
        System.out.println(count);
    }
}
