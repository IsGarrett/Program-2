public class CheckingAccount extends BankAccount{

    int overdraftFee;


    public CheckingAccount() {

        
            this.accountNumber = "0000-0000-0000-0000";
            this.interestRate = 0;
            this.balance = 0;
            this.overdraftFee = 0;
    
        }


    

    public int getBalance(){

        
        return balance;

    }
 
    public boolean debit(int amount) {
       
        balance -= amount;

        if (balance < 0) {
            balance -= overdraftFee;
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
       
        setInterestRate(interestRate);
        double interestAmount  = getInterestRate() * balance;

        if (balance < 0) {
            interestAmount = 0;
                    
        } else 
            {           
                balance += interestAmount;
        }
        return getBalance();
    }
    

    
    public String getAccountInfo() {
        
        String info = "";
        
        info += "Account type  : Checking\n";
        info += "Account #     : " + accountNumber + "\n";
        info += "Balance       : " + String.format("$%.2f", (balance / 100.0)) + "\n";
        info += "Interest rate : " + String.format("%.2f%%", (interestRate * 100)) + "\n";
        //info += "Credit limit  : " + String.format("$%.2f", (creditLimit / 100.0)) + "\n";
        info += "Overdraft fee : " + String.format("$%.2f", (overdraftFee / 100.0)) + "\n";
        
        return info;
    }
    
}
