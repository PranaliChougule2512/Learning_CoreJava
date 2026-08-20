public class ifelse_ladder {
    public static void main(String[] args) {
        int age=17;
        //if(condition)
        //{
        //code or logic
        //}
        //elseif(condition)
        //{
        //code or logic
        //}else{
        //stmt
        //}
        if(age>=18){
            System.out.println("Adult");
        }
        else if(age>=14 && age<18){
            System.out.println("minor");

        }
        else{
            System.out.println("NA");
        }
        //task
         int marks=85;
         if(marks<=100 && marks>=80){
            System.out.println("A+");
        }
        else if(marks<80 && marks>=60){
            System.out.println("B");

        }
        else if(marks<60 && marks>=35){
            System.out.println("c");

        }
        else{
            System.out.println("Fail");
        }
    
    }
}
