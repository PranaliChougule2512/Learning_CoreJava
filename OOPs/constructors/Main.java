class Employee{
    String name;
    double salary;

    Employee(String name, double salary){
        this.name =name;
        this.salary= salary;
        System.out.println("Constructer Executed");
    }
    void displayInfo(){
        System.out.println("Employee Name is "+name+" with salary "+salary);
    }
}
public class Main {
    public static void main(String[] args) {
        Employee emp1=new Employee("Pranali",85000.00);
        emp1.displayInfo();
    }
    
}
