
public class BankTest {
    public static void main(String[] args){
        BankAccount accoun1 = new BankAccount();
        BankAccount accoun2 = new BankAccount();
        BankAccount accoun3 = new BankAccount();
        BankAccount account4 = new BankAccount("Andre");
        BankAccount account5 = new BankAccount();

        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney


        // accoun1.depositChecking(500);
        // System.out.println(accoun1.getBalance());
        // accoun2.depositSaving(9600);
        // System.out.println(accoun2.getBalance());
        // accoun3.depositChecking(1000);
        // System.out.println(accoun3.getBalance());
        // System.out.println("total money is: " + BankAccount.getTotalMoney());



        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        
        
        // accoun2.withdrawSaving(1500);
        // System.out.println(accoun2.getBalance());
        // accoun1.withdrawSaving(500);
        // System.out.println(accoun1.getBalance());
        // System.out.println("total money is: " + BankAccount.getTotalMoney());


        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println(account4.getAccountNumber());
        System.out.println(account5.getAccountNumber());
        System.out.println(account4.getAccountName());
        System.out.println("number of bank accounts is: " + BankAccount.getNumberOfAccounts());
        System.out.println("total money is: " + BankAccount.getTotalMoney());



    }
}

