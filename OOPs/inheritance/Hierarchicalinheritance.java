class Account{
    String accountHoldername;
    double balance;
    void deposit(double amount){
        balance+= amount; //balance=balance+amount
        System.out.println("Deposited: "+ amount + "New balance: "+ balance);
}
}
 //derived class 1
    class Savingsaccount extends Account{
        double interestrate;
        void applyinterest(){
            double interest = balance*interestrate/100;
            balance+=interest;
             System.out.println("Interest added: "+ interest + "New balance: "+ balance);
        }
    }
     //derived class 2
    class Currentaccount extends Account{
        double overdraftlimit;
        void withdraw(double amount){
            if(balance+ overdraftlimit>=amount){
                balance-=amount;
                System.out.println("Withdrawn:"+amount+"NewBalance: "+balance);
            }else{
                System.out.println("Withdrawl denied.Overdraft limit exceed.");
            }
        }
    }
public class Hierarchicalinheritance {
    public static void main(String[] args) {
        Savingsaccount sa= new Savingsaccount();
         sa.accountHoldername="Pranali";
        sa.balance=100000.00;
        sa.interestrate=5.0;
        sa.deposit(500.0);
        sa.applyinterest();

        Currentaccount ca=new Currentaccount();
        ca.accountHoldername="Sanvi";
        ca.overdraftlimit=500;
        ca.balance=1000;
        ca.deposit(500.0);
        ca.withdraw(1200);
    }
}
