import java.util.Random;

public class BankAccount {
        // MEMBER VARIABLES
    private String username;
    private String accountnumber;
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts = 0;
    private static double totalMoney = 0.0; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount(String name) {
        username = name;
        this.accountnumber = generateAccountNumber();
        accounts++;
    }
    public BankAccount() {
        this.accountnumber = generateAccountNumber();
        accounts++;
    }

    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getChecking(){
        return this.checkingBalance;
    }
    public double getSaving(){
        return this.savingsBalance;
    }
    public static int getNumberOfAccounts(){
        return accounts;
    }
    public static double getTotalMoney(){
        return totalMoney;
    }
    public String getAccountNumber(){
        return this.accountnumber;
    }

    public String getAccountName(){
        return this.username;
    }
    // METHODS
    // deposit
    public void depositChecking(double deposit){
        checkingBalance += deposit;
        totalMoney += deposit;
    }
    public void depositSaving(double deposit){
        savingsBalance += deposit;
        totalMoney += deposit;
    }

    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    public void withdrawChecking(double amount){
        if (amount > 0){
            if (checkingBalance >= amount){
                checkingBalance -= amount;
                totalMoney -= amount;
                System.out.println(amount + " withdrawed from your checking account");

            }
            else{
                System.out.println("insufficient balance in checking account");
            }
        }
        else{
            System.out.println("amount should be greater than zero");
        }
    }
    public void withdrawSaving(double amount){
        if (amount > 0){
            if (savingsBalance >= amount){
                savingsBalance -= amount;
                totalMoney -= amount;
                System.out.println(amount + " withdrawed from your saving account");

            }
            else{
                System.out.println("insufficient balance in saving account");
            }
        }
        else{
            System.out.println("amount should be greater than zero");
        }
    }
    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public double getBalance(){
        return savingsBalance+checkingBalance;
    }



    private int generateNumber() {
        Random randMachine = new Random();
        int num = randMachine.nextInt(10);
        return num;
        
}
    private String generateAccountNumber(){
        String accnum = "";
        for (int i = 0 ; i<10 ; i++){
            accnum += generateNumber();
        }
        return accnum;
    }


}
