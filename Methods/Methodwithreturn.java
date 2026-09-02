// a method that return a values back to the columnn
public class Methodwithreturn{
    int add() {
        int a=3;
        int b=5;
        int result=a+b;
        return result;
    }
    public static void main(String[] args) {
        Methodwithreturn mwr=new Methodwithreturn();
        System.out.println(mwr.add());
    }
}
// same example for method without parameter