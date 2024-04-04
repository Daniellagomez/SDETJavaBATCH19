package Class15;

public class CatTester {
    public static void main(String[] args) {
        Cat c= new Cat("Michu","Orange",4);
        Cat c1=new Cat();
        c.name="Michu";
        c.age=4;
        c.color="Orange";
        c.printInfo();

        Cat c2=new Cat ();
        c2.name="Gaga";
        c2.age=6;
        c2.color="white";
        c2.printInfo();

        Cat c3=new Cat();
        c3.name="Twinkle";
        c3.age=2;
        c3.color="gray";
        c3.printInfo();

    }
}
