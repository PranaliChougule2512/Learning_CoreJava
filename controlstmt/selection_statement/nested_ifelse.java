public class nested_ifelse {
    public static void main(String[] args) {
        int age=27;
        boolean hasLicense=true;
        if(age>=18){
          if(hasLicense){
            System.out.println("Drive");
          }else{
            System.out.println("Need License");
          }
        }
        else{
            System.out.println("You are Underage");
        }

    }
    
}
