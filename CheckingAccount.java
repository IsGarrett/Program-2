public class CheckingAccount extends BankAccount{

    int overdraftFee;


    public CheckingAccount(String accountNumber, double interestRate, int balance) {

        super(accountNumber, interestRate, balance);

    }


    public CheckingAccount(){

        super("0000-0000-0000-0000", 0, 0);

    }

    public int getBalance(){

        return balance + 125;

    }
 
    public boolean debit(int amount) {
       
        balance = balance - amount;

        if (balance < 0) {
            balance = balance - overdraftFee - amount;
        }
        
        return true;
        
    }

    public int getOverdraftFee(){

        return overdraftFee;

            
    }

    public void setOverdraftFee(int overdraftFee){

        this.overdraftFee = overdraftFee;

    }

    public double applyInterest() {
        
        double interestAmount;
        
        if (balance < 0) {
            interestAmount = (int) (interestRate * 0);
            return interestAmount; 
        }

        interestAmount = (interestRate * balance);
        
        return interestAmount + balance;
            
        } 
    

    
    public String getAccountInfo() {
        
        return String.format("Account type : %s\nAccount # : %d\nBalance : $%.2f\nInterest rate : %.2f%%", accountNumber, balance, interestRate);

    }
    
}
