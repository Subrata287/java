import java.util.Scanner;
class Account{
    private int bal;
    public Account(int bal){
        this.bal=bal;
    }
        public boolean isSufficientBal(int withdrawAmount){
            if(bal>=withdrawAmount){
                return(true);
            }else{
                return(false);
            }
        }
    public void withdraw(int amount){
        bal= bal-amount;
        System.out.println("Withdrawl Amount is: "+amount);
        System.out.println("Your Current Balance is: "+bal);
    }
}
class Customer implements Runnable{
    private String c_name;
    private Account account;
    public Customer(Account account, String c_name){
        this.account=account;
        this.c_name=c_name;
    }
    public void run(){
        Scanner obj1=new Scanner(System.in);
        synchronized(account){
        System.out.println("Enter Amount to Withdraw: ");
        int amount=obj1.nextInt();

        if(account.isSufficientBal(amount)){
            account.withdraw(amount);
        }else{
            System.out.println("Insufficient Balance. ");
        }
    }
}
}
public class Demo{
    public static void main(String[] args){
        Account a1= new Account(10000);
        Customer c1= new Customer(a1,"Rakesh"),c2 = new Customer(a1,"Ankit");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();
    }
}