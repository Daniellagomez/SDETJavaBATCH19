package Class14;

public class DogTester {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.name="Jacky";
        d1.age=12;
        d1.color="Black";

        Dog d2=new Dog();
        d2.name="Jimmi";
        d2.age=20;
        d2.color="White";

        System.out.println(d2.name);
        System.out.println(d1.name);
        System.out.println(d2.noOfLegs);
        System.out.println(d1.noOfLegs);


    }
}
