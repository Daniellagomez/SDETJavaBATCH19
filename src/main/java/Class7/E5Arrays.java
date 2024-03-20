package Class7;

import java.util.Arrays;

public class E5Arrays {

    public static void main(String[] args) {

        char [] grades=new char[4];
        //storing the letter A inside the box 0
        grades[0]='A';
        grades[1]='B';
        grades[2]='C';
        grades[3]='D';
        // we only hvae 4 boxes last box is at index 3
        // grades[4]='f';
        System.out.println(Arrays.toString(grades));
    }
}
