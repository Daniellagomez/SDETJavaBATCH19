package Class16;
/*
Write a teacher class that have instance variables
name and address. Create a constructor that will initialize
those variables. Print name & address of given teacher using

 */
public class Teacher {

        private String name;
        private String address;


        public Teacher(String name, String address) {
            this.name = name;
            this.address = address;
        }

        void displayInfo() {
            System.out.println(name + " " + address);
        }

        public static void main(String[] args) {
            Teacher a = new Teacher("Soul Amore", "101 smith road");
            a.displayInfo();
        }

    }

