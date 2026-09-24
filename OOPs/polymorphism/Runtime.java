class Employee{
    String name;
    double basesalary;

    public double calculateSalary(){
        return  basesalary;//default logic
    }
    public void displayDetails(){
        System.out.println("Name: " +name);
        System.out.println("Salary:"+ calculateSalary());
    }
}
//derived class
class FulltimeEmployee extends Employee{
    double bonus;
    @Override 
    public double calculateSalary(){
        return basesalary; //custom logic for fulltime employee

    }
}
public class Runtime {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.name="Tom Cruise";
        emp.basesalary=50000.0;
        emp.displayDetails();
        FulltimeEmployee ftemp= new FulltimeEmployee();
        ftemp.name="James Thomas";
        ftemp.basesalary=60000.0;
        ftemp.displayDetails();
        }
}
