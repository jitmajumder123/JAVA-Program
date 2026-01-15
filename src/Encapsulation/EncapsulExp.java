package Encapsulation;

class BankAccount {
    private double balance = 10000; // Balance is private (safe)

    // Getter method to read the balance
    public double getBalance() {
        return balance;
    }

    // Setter method to update the balance safely
    public void setBalance(double amount) {
        if (amount > 0) { // Check to allow only positive amounts
            balance = amount;
        } else {
            System.out.println("Invalid amount!");
        }
    }
}
public class EncapsulExp
{
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        System.out.println("Current Balance: ₹" + account.getBalance()); // Read balance

        account.setBalance(15000); // Update balance safely
        System.out.println("Updated Balance: ₹" + account.getBalance());

        account.setBalance(-5000); // This will be rejected
    }
}