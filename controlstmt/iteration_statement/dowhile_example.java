public class dowhile_example {
    public static void main(String[] args) {
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);

        //even number
        int a=1;
        do{
            if(a%2==0){
                System.out.println(a);
            }
            a++;
        } while(a<=100);
    }
}
