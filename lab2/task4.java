class Account{
    protected Double balance=0.0;
    
    public void deposit(Double amount) {
        balance+=amount;
    }
    
    public void withdraw(double draw) {
    balance-=draw;
    }

}
class SavingAccount extends Account{
    private double interestRate=2.5;
    public void SetdefaultInterestRate(double rate) {
        balance+=rate;
    }
    public void checkbalance() {
        System.out.println(balance);
    }
}
public class task4 {
    public static void main(String[] args) {
    SavingAccount acc=new SavingAccount();
    acc.deposit(40.0);
    acc.SetdefaultInterestRate(20.0);
        acc.checkbalance();
        acc.withdraw(20.0);

    }
}
