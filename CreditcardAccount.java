
//Credit card class extends BankAccount
public class CreditcardAccount extends BankAccount {

    //---Data---
    int creditLimit;

    //Constructor
    public CreditcardAccount() {

            this.accountNumber = "0000-0000-0000-0000";
            this.interestRate = 0;
            this.balance = 0;
            this.creditLimit = 0;
    
        }

    //returns the balance of the account
    public int getBalance(){

        return balance;

    }

    //debit method for debitting accounts
    //subtracts any overdraft fee, if there is one.
    public boolean debit(int amount) {
       
        if (balance - amount < -creditLimit) {
            return false;
        }
        balance -= amount;
        return true;
    }

    //sets the credit card limit amount
    public void setCreditLimit(int creditLimit){

        this.creditLimit = creditLimit;

    }

    //returns the credit limit
    public int getCreditLimit(){

        return creditLimit;

    }

    //returns the interest rate
    public double getInterestRate() {

        return interestRate;

    }

    //sets the interest rate for the account
    public void setInterestRate(double interestRate) {

        this.interestRate = interestRate;

    }

    //applies the interest accrued for the account
    public double applyInterest() {
       
       double interestAmount  = getInterestRate() * balance;
    
        balance += interestAmount;

        return getBalance();
        }

   
     //returns the account info in a formatted String
    public String getAccountInfo() {
        
        String info = "";
        
        info += "Account type  : Creditcard\n";
        info += "Account #     : " + accountNumber + "\n";
        info += "Balance       : " + String.format("$%.2f", (balance / 100.0)) + "\n";
        info += "Interest rate : " + String.format("%.2f%%", (interestRate * 100)) + "\n";
        info += "Credit limit  : " + String.format("$%.2f", (creditLimit / 100.0)) + "\n";
        
        return info;

    }
    
}
