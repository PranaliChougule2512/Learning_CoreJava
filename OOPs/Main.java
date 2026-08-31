class Dog{
    //String name= "Simbha";
    String name;
    void bark(){
        System.out.println(name+" barks at strangers! ");
    }
}
public class Main{
    public static void main(String[] args) {
        
        Dog obj = new Dog();
         obj.name="Simbha";
          obj.bark();
    }
}