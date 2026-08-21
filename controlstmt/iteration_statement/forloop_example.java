public class forloop_example{
    public static void main(String[] args){
        //syntax
        //for(initialization;condition;iteration){
        // statement
        // }

        //display 1-5 numbers
        for(int i=1;i<=5;i++) {
            System.out.println(i);
        }
        //o/p: 1, 2, 3, 4, 5


        //array
        int[]number={10,20,30,40};
        for (int n :number){
            System.out.println(n);
        }
        //o/p:10,20,30,40

        //print all even number between 0to100
        for (int i=0;i<=100;i++){
            if(i%2==0){
                System.out.println("even numbers:" +i);
            }
            
        }
        //o/p:even numbers
    }
}