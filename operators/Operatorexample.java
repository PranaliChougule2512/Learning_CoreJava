class Operatorexample {
    public static void main(String[] args) {
        // arithmetic operators
        int num1 = 10;
        int num2 = 20;

        System.out.println(num1 + num2);//30
        System.out.println(num1 - num2);//-10
        System.out.println(num1 * num2);//200
        System.out.println(num1 / num2);//0
        System.out.println(num1 % num2);//10

        // relational operators
        int a = 10;
        int b = 5;
        System.out.println(a < b);//false
        System.out.println(a > b);//true
        System.out.println(a <= b);//false
        System.out.println(a >= b);//true
        System.out.println(a != b);//true
        System.out.println(a == b);//false

        // logical operators
        boolean x = true;
        boolean y = true;
        boolean admin = false;
        System.out.println(x & y);//true
        System.out.println(x | y);//true
        System.out.println(!admin);//true

        //unary operators
        int num=7;
        int result=num++;
        System.out.println(result);//7
        System.out.println(num);//8
        result=++num;
        System.out.println(result);//9
        System.out.println(num);//9


    }
}