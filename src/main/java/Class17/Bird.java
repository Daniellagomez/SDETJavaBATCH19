package Class17;

public class Bird {
    String name;
    String color;
    int age;

    Bird(String name, String color, int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }
    void printInfo() {
        System.out.println(name + " " + color + " " + age);
    }
}
class Parrot extends Bird{

    Parrot(String name, String color, int age){
        super(name,color,age);
    }
    }

class BirdTester{
    public static void main(String[] args) {
        Parrot p=new Parrot("Tiki","green",2);
        p.printInfo();
    }
}