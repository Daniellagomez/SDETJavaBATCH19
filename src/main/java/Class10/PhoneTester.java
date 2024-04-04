package Class10;

public class PhoneTester {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.brand="Apple";
        phone.capacity="32g";
        phone.color="Black";
        phone.model="iphone16";
        phone.price="1000";

        System.out.println(phone.brand);
        System.out.println(phone.capacity);
        System.out.println(phone.color);
        System.out.println(phone.model);
        System.out.println(phone.price);
        phone.makeAcall();
        phone.takePictures();
        phone.playMusic();

        Phone phone2=new Phone();
        phone2.brand="Samsung";
        phone2.capacity="64g";
        phone2.color="Blue";
        phone2.model="GalaxyS24";
        phone2.price="500";

        System.out.println(phone2.brand);
        System.out.println(phone2.capacity);
        System.out.println(phone2.color);
        System.out.println(phone2.price);
        phone2.makeAcall();
        phone2.takePictures();
        phone2.playMusic();
    }

}
