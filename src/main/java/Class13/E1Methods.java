package Class13;
/*
create a method that will say Hello in different languages
based on the country that will be passed when method is executed.
do it for any five countries
 */
public class E1Methods {



    void sayHello(String country){

        switch (country) {
            case "USA":
                System.out.println("Hello");
                break;
            case "France":
                System.out.println("Bonjour");
                break;
            case "Egypt":
                System.out.println("Marhaba");
                break;
            case "Serbia":
                System.out.println("Zdravo");
                break;
            case "Spain":
                System.out.println("Hola");
                break;
            default:
                System.out.println("Country not supported");

        }

    }

    public static void main(String[] args) {
        E1Methods e1=new E1Methods();
        e1.sayHello("Serbia");
    }

}
