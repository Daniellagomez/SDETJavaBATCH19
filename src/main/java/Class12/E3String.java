package Class12;

public class E3String {
    public static void main(String[] args) {
        StringBuilder st=new StringBuilder("Sunday7343Monday");
        //st.deleteCharAt(6); this deletes single characters, this example deleted '7'
        // deletes a range of characters
        st.delete(6,10);
        System.out.println(st);


        




    }
}
