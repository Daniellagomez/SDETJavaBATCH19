package Review5;

public class E2_2DArrays {
    public static void main(String[] args) {

        String[][] names = {
                {"James", "Ihab", "Ana"},
                {"Zarina", "Teona", "Manu"},
                {"Will", "Barkat", "Olga"}

        };
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.println(names[row][col] + " ");
            }
            System.out.println();
        }


    }
}