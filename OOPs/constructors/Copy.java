class Employee{
    String name;
    double salary;

    Employee(String name, double salary){
        this.name =name;
        this.salary= salary;
        System.out.println("Par,Constructer Executed");
    }
   
    
    Employee(Employee emp){
        this.name =emp.name;
        this.salary= emp.salary;
        System.out.println("Copy Constructer Executed");
    }
      void displayInfo(){
        System.out.println("Employee Name is "+name+" with salary "+salary);
    }
}
public class Copy {
    public static void main(String[] args) {
        Employee emp1=new Employee("Pranali",85000.00);
        emp1.displayInfo();
        Employee emp2=new Employee(emp1);
        emp2.name="Sakshi";
        emp2.salary=52000.00;
        emp2.displayInfo();
    }
    
}
