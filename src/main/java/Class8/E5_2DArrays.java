package Class8;

public class E5_2DArrays {
    /*
        10, 20,40,50},
                {22,40,90,65},
                {15,50,33,30}
     */

    public static void main(String[] args) {
        int [][] matrix= {
                {10,20,40,50},
                {22,40,90,65},
                {15,50,33,30}

        };

        for (int i= 0; i<3; i++){
            for (int j=0; j<4; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
