package Class8;

public class E1Break {

    public static void main(String[] args) {

        String [] names={"james","Iram","Matt Naughty","Aladin","Ubaidur","Ana","Silvia"};
        String name="Ubaidur";
        for (String n: names)
            if (name.equals(name)){
            System.out.println("Name is present");
            break;
        }

    }
}

