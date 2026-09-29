abstract class Vehicle{
    int nooftyres;
    void displaytyres() {
        System.out.println("No.of tyres: "+nooftyres);
    }
   abstract void start();
}
class Car extends Vehicle{
    
    void start(){
        nooftyres=4;
        System.out.println("Cars starts with key");
    }
}
class Bike extends Vehicle{
   
    void start(){
        nooftyres=2;
        System.out.println("Bike starts with kick");
    }
}
public class Main {
    public static void main(String[]args){
       Vehicle v= new Car();
       v.start();
       v.displaytyres();
    }
}
