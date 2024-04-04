package Class14;

public class StudentsTester {
    public static void main(String[] args) {
        Students st1=new Students();
        st1.name="Soul";
        st1.id=0012662;
        st1.numStudents ++;

        System.out.println(st1.name);
        System.out.println(st1.id);
        System.out.println(st1.numStudents);

        Students st2=new Students();
        st2.name="Pablo";
        st2.id=0012663;
        st2.numStudents ++;

        System.out.println(st2.name);
        System.out.println(st2.id);
        System.out.println(st2.numStudents);


    }
}
