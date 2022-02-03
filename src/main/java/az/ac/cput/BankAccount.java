package az.ac.cput;

/* @author: Karl H - 220236585 */
// Allows a user to interact with their bank account

public class BankAccount {
    private int balance;
    private int previousTransaction;
    private final String customerName;
    private final String customerID;

    BankAccount(String customerName, String customerID) {
        this.customerName = customerName;
        this.customerID =  customerID;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }

    public void deposit(int amount) {
        if(amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    public int withdraw(int amount) {
        if(amount != 0) {
            balance = balance - amount;
            previousTransaction = amount;
        }
        return amount;
    }

    public int getPreviousTransaction() {
        if(previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
            return previousTransaction;
        }
        else if(previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
            return previousTransaction;
        }
            System.out.println("Error: No Transaction Occurred");
        return -1;
    }

    public int getTotal() {
        return balance;
    }
}
