package Class16;

public class Task2 {

    public class NewConsturctor {
        protected NewConsturctor(){
            System.out.println("new");
        }
        private NewConsturctor(String alr){
            System.out.println(alr);
        }
        NewConsturctor(int lew){
            System.out.println(lew);

        }

        public NewConsturctor(char will){
            System.out.println(will);
        }

        public static void main(String[] args) {
            System.out.println("Hallo!");
        }

    }
}
