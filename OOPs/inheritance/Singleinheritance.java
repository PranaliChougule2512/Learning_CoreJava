//base class
class Account{
    String accountHoldername;
    double balance;
    void deposit(double amount){
        balance+= amount; //balance=balance+amount
        System.out.println("Deposited: "+ amount + "New balance: "+ balance);
    }
}
    //derived class
    class Savingsaccount extends Account{
        double interestrate;
        void applyinterest(){
            double interest = balance*interestrate/100;
            balance+=interest;
             System.out.println("Interest added: "+ interest + "New balance: "+ balance);
        }
    }

    public class Singleinheritance{

    public static void main(String[] args) {
        Savingsaccount sa = new Savingsaccount();
        sa.accountHoldername="Pranali";
        sa.balance=100000.00;
        sa.interestrate=5.0;
        sa.deposit(500.0);
        sa.applyinterest();

    }
}
