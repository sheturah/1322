
public class Account {

       private int accountNumber;
        private double balance = 0;
        private int nextAccountNumber = 10000;

       public Account()
       {
           this.balance = 0;
       }
    public Account(double balance)
    {
       this.balance = balance;
       nextAccountNumber++;
    
       this.accountNumber = nextAccountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
      this.accountNumber = accountNumber;
    }

    public void withdrawl(double withdrawl)
    {
        this.balance -= withdrawl;
    }
    public void deposit(double deposit)
    {
       this.balance += deposit;
    }

}
