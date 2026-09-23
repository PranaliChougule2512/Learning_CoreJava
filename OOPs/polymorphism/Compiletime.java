class meth{
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a, double b, double c){
        return a+b+c;
    }
    
}
public class Compiletime{
    public static void main(String[] args) {
        meth m=new meth();
        System.out.println(m.add(5, 04));
        System.out.println(m.add(5, 4, 5));
        System.out.println(m.add(5.0, 10.2));
        System.out.println(m.add(2.5, 0.3, 5.0));
    }
}