package Class16;

public class Employee {

    private String name;
    private  String id;
    private int age;
    private double salary;

    public Employee(String eName, String eId,int eAge, double eSalary){
        name=eName;
        id=eId;
        if (eAge<150){
         age=eAge;
        }else{
            System.out.println("Not allowed");
        }
        salary=eSalary;

    }

    void printName(){

    }
    int getAge(){
        return age;
    }
    void printInfo(){
        System.out.println(id+" "+name+" "+age+" "+salary);
    }
}
