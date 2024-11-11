
//Checking account class that extends BankAccount
public class CheckingAccount extends BankAccount{

    //---Data----
    int overdraftFee;

    //Constructor 
    public CheckingAccount() {

        
            this.accountNumber = "0000-0000-0000-0000";
            this.interestRate = 0;
            this.balance = 0;
            this.overdraftFee = 0;
    
        }


    
    //returns the balance of the account
    public int getBalance(){

        
        return balance;

    }
 
    //debit method for debitting accounts
    //subtracts any overdraft fee, if there is one.
    public boolean debit(int amount) {
       
        balance -= amount;

        if (balance < 0) {
            balance -= overdraftFee;
        }
            
        return true;
    }
    
    //returns the overdraft fee
    public int getOverdraftFee(){

        return overdraftFee;

            
    }

    //sets the overdraft fee for the account 
    public void setOverdraftFee(int overdraftFee){

        this.overdraftFee = overdraftFee;

    }

    //applies the interest for the account
    //determines if the account is eligible if the account is more than zero
    //if so, it will calculate the interest accrued then add it to the balance
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
    

    //returns the account info in a formatted String
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
