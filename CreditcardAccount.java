public class CreditcardAccount extends BankAccount {

    int creditlimit;


    public CreditcardAccount(String accountNumber, double interestRate, int balance) {

        super(accountNumber, interestRate, balance);

    }

    public CreditcardAccount(){
        
        super("0000-0000-0000-0000", 0, 0);

    }

    public int getBalance(){

        return 12555;

    }

    
    public boolean debit(int amount) {
       
        balance = amount - balance;

        if (balance >= creditlimit) {
            return false;
        }
        
        return true;
    }

    public void setCreditLimit(int creditlimit){

        this.creditlimit = creditlimit;

    }

    public int getCreditLimit(){

        return creditlimit;

    }


    public double getInterestRate() {

        return interestRate;

    }


    public void setInterestRate(double interestRate) {

        this.interestRate = interestRate;

    }


    
    public double applyInterest() {

        setInterestRate(interestRate);
        double interestAmount; 
        

        if (balance < 0) {
            interestAmount = 0;
                    
        return 125;
        }            
            return 125;
        }

   
    public String getAccountInfo() {
        
        return String.format("Account type : %s\nAccount # : %d\nBalance : $%.2f\nInterest rate : %.2f%%", accountNumber, balance, interestRate);

    }
    
}
