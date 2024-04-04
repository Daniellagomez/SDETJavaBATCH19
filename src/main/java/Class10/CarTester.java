package Class10;

public class CarTester {
    public static void main(String[] args) {

        Car toyotaCar=new Car();
        toyotaCar.make="Toyota";
        toyotaCar.model="Supra";
        toyotaCar.year=2024;
        toyotaCar.price=50000;
        System.out.println(toyotaCar.make);
        System.out.println(toyotaCar.model);
        System.out.println(toyotaCar.year);
        System.out.println(toyotaCar.price);
        toyotaCar.moveForward();
        toyotaCar.applyBrakes();

        Car lexusCar=new Car();
        lexusCar.make="Lexus";
        lexusCar.model="LS460";
        lexusCar.year=2008;
        lexusCar.price=20000;
        System.out.println(lexusCar.make);
        System.out.println(lexusCar.model);
        System.out.println(lexusCar.year);
        System.out.println(lexusCar.price);
        lexusCar.moveForward();
        lexusCar.applyBrakes();

    }
}
