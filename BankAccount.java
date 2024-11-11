public abstract class BankAccount {

    String accountNumber;
    double interestRate;
    int balance; 
    String accountType;


    


    public boolean credit(int amount){

        balance += amount;
        return true;


    }

    public abstract boolean debit(int amount);


    public int getBalance(){
        
        return balance;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        
        this.accountNumber = accountNumber;

    }

    public double getInterestRate() {

        return interestRate;

    }


    public void setInterestRate(double interestRate) {

        this.interestRate = interestRate;

    }

    public abstract double applyInterest();


    public abstract String getAccountInfo();
    
    
}
