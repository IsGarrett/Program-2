/* CSC 205: <Class 26063> / <Online>
Minilab: <Program 2>
Author(s): <Garrett Lambert> & <gar2161746>

Description: The purpose of this code is to provide basic functionallity for a checking, savings and credit card accounts. It uses
various methods to perform functions such as credit, debit, displaying balances and other necessary methods. 
The code utilizes a main method to display a menu for user prompts that will allow the users to make selections that perform the various functions. 
*/

//Abstract BankAccount class
public abstract class BankAccount {

    //----Data-----
    String accountNumber;
    double interestRate;
    int balance; 
    String accountType;


    

    //credit method for crediting accounts
    public boolean credit(int amount){

        balance += amount;
        return true;


    }

    //debit method for debitting accounts
    public abstract boolean debit(int amount);


    //returns the balance of the account
    public int getBalance(){
        
        return balance;

    }

    //returns the account number 
    public String getAccountNumber() {
        return accountNumber;
    }

    //sets the account number
    public void setAccountNumber(String accountNumber) {
        
        this.accountNumber = accountNumber;

    }

    //returns the interest rate
    public double getInterestRate() {

        return interestRate;

    }

    //sets the interest rate for the account
    public void setInterestRate(double interestRate) {

        this.interestRate = interestRate;

    }

    //applys the interest for the account, determins it 
    public abstract double applyInterest();

    // returns the account info in a formatted structure
    public abstract String getAccountInfo();
    
    
}
