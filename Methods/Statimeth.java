public class Statimeth {
    static int add(int num1, int num2){
        int result = num1+num2; 
        return result;
    }
    public static void main(String[] args) {
        System.out.println(add(4, 5));
         System.out.println(Statimeth.add(4, 5));//legal way
    }
}
//static keyword: when we put static infront of something(variable, methods, class)it means this things belongs to class not to an object
//it will have only one copy in a memory
// only one copy of that member exist in  memory regardless of how many obj of class you create 
// example: 1. utility classes like math operation ,2.database collection pool, 3. counting  total users created,4. configuration operations/constants