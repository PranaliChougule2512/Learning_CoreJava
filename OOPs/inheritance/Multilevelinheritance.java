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
    //derived derived class
    class PremiumSavingsaccount extends Savingsaccount{
        double extrainterestrate;
        void applypremiuminterest(){
            double extrainterest=balance*extrainterestrate/100;
            balance+= extrainterest;
            System.out.println("Extra interest added: "+extrainterest+"New balance: "+ balance);
        }
    }
public class Multilevelinheritance {
    public static void main(String[] args) {
        PremiumSavingsaccount psa=new PremiumSavingsaccount();
         psa.accountHoldername="Sanvi";
        psa.balance=100000.00;
        psa.interestrate=5.0;
        psa.extrainterestrate=6.0;
        psa.deposit(500.0);
        psa.applyinterest();
        psa.applypremiuminterest();
    }
}
