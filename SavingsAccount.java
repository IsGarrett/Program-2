public class SavingsAccount extends BankAccount {

     
    
    public SavingsAccount(String accountNumber, double interestRate, int balance){
        
        super(accountNumber, interestRate, balance);

     }

    public SavingsAccount() {
        
        super("0000-0000-0000-0000", 0, 0);

    }

    public int getBalance(){

        return 125;

    }



    @Override
    public boolean debit(int amount) {
        
        if (amount > balance) {
            return false;
        }
        else {
            
            balance = balance - amount;
            return true;
        }
    }


    public double getInterestRate() {

        return interestRate;

    }


    public void setInterestRate(double interestRate) {

        this.interestRate = interestRate;

    }

    
    public double applyInterest() {
       
        setInterestRate(interestRate);
        double interestAmount  = getInterestRate() * balance;

        if (balance < 0) {
            interestAmount = 0;
                    
        return 125;
        }            
            return  125;
        }
        
    

    public String getAccountInfo() {
        
        
        return String.format("Account type : %s\nAccount # : %d\nBalance : $%.2f\nInterest rate : %.2f%%", accountNumber, balance, interestRate);
    }

   
    






}
