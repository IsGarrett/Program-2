public class SavingsAccount extends BankAccount {

     

    public SavingsAccount() {
        
        this.accountNumber = "0000-0000-0000-0000";
        this.interestRate = 0;
        this.balance = 0;
        this.accountType = "Savings";

    }

    

    public int getBalance(){

        return balance;

    }



    @Override
    public boolean debit(int amount) {
        
        if (amount > balance) {
            return false;
        }
        else {
            
            balance -= amount;
            
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
                    
        return getBalance();
        }         balance = (int) (interestAmount + balance);   
            return  balance;
        }
        
    

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

   
    







