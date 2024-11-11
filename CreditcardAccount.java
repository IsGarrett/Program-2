public class CreditcardAccount extends BankAccount {

    int creditLimit;


    public CreditcardAccount() {

            this.accountNumber = "0000-0000-0000-0000";
            this.interestRate = 0;
            this.balance = 0;
            this.creditLimit = 0;
    
        }

    public int getBalance(){

        return balance;

    }

    
    public boolean debit(int amount) {
       
        

        if (balance - amount < -creditLimit) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public void setCreditLimit(int creditLimit){

        this.creditLimit = creditLimit;

    }

    public int getCreditLimit(){

        return creditLimit;

    }


    public double getInterestRate() {

        return interestRate;

    }


    public void setInterestRate(double interestRate) {

        this.interestRate = interestRate;

    }

    public double applyInterest() {
       
       
            
            double interestAmount  = getInterestRate() * balance;
    
                       
                balance += interestAmount;

                return getBalance();
            }

   
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
