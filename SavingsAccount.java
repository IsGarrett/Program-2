
//SavingsAccount class extends the BankAccount class 
public class SavingsAccount extends BankAccount {

     
    //Constructor
    public SavingsAccount() {
        
        this.accountNumber = "0000-0000-0000-0000";
        this.interestRate = 0;
        this.balance = 0;
        this.accountType = "Savings";

    }

    
    //returns the balance
    public int getBalance(){

        return balance;

    }



    //debits the account, debits only return true if 
    //the savings account has the funds available cannot be overdrawn
    public boolean debit(int amount) {
        
        if (amount > balance) {
            return false;
        }
        else {
            
            balance -= amount;
            
            return true;
        }
    }

    //returns the interest rate
    public double getInterestRate() {

        return interestRate;

    }

    //sets the interest rate
    public void setInterestRate(double interestRate) {

        this.interestRate = interestRate;

    }

    //applies the interest for the account
    //determines if the account is eligible if the account is more than zero
    //if so, it will calculate the interest accrued then add it to the balance
    public double applyInterest() {
       
        setInterestRate(interestRate);
        double interestAmount  = getInterestRate() * balance;

        if (balance < 0) {
            interestAmount = 0;
                    
        return getBalance();
        }         balance = (int) (interestAmount + balance);   
            return  balance;
        }
        
    
    //returns the account info in a formatted String
    public String getAccountInfo() {
            
        String info = "";
        
        info += "Account type  : Savings\n";
        info += "Account #     : " + accountNumber + "\n";
        info += "Balance       : " + String.format("$%.2f", (balance / 100.0)) + "\n";
        info += "Interest rate : " + String.format("%.2f%%", (interestRate * 100)) + "\n";
        //info += "Credit limit  : " + String.format("$%.2f", (creditLimit / 100.0)) + "\n";
        
        return info;
        }


        

    }

   
    







