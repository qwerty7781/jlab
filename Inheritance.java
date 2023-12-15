class Employee{

    String name;
    int age;
    int phno;
    String address;
    double salary;
    void printDetails(){
        System.out.println("Name : "+name);
        System.out.println("Age  : "+age);
        System.out.println("Phno: "+phno);
        System.out.println("Address : "+address);
    }
    void printSalary(){
        System.out.println("The salary is: "+salary);
    }

}
class Officer extends Employee{
    String specialization;
    void printSpecialization(){
        System.out.println("specialization: "+specialization);
    }
}
class Manager extends Employee{
    String department;
    void printDepartment(){
        System.out.println("department is: "+department);
    }
}
public class Inheritance{
    public static void main(String[] args){
        Officer x=new Officer();
        x.name="sreya";
        x.age=26;
        x.phno=896246;
        x.address="Sreyabhavan";
        x.salary=50000;
        x.specialization="Data analysis and Exploration";
        System.out.println("the details of officer is:");
        x.printDetails();
        x.printSalary();
        x.printSpecialization();
        Manager y= new Manager();
        y.name="Ramu";
        y.age=30;
        y.phno=789456;
        y.address="ramupuram";
        y.salary=60000;
        y.department="HR";
        System.out.println("\nthe details of manager are:");
        y.printDetails();
        y.printSalary();
        y.printDepartment();
    }
}