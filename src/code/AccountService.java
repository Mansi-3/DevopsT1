package src.code;

public class AccountService {

    // Deposit amount
    public int deposit(int balance, int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount");
        }
        return balance + amount;
    }

    // Withdraw amount
    public int withdraw(int balance, int amount) {
        if (amount > balance) {
            throw new ArithmeticException("Insufficient balance");
        }
        return balance - amount;
    }

    // Check minimum balance
    public boolean isMinimumBalance(int balance) {
        return balance >= 1000;
    }

    // Calculate interest (simple 10%)
    public double calculateInterest(int balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Invalid balance");
        }
        return balance * 0.1;
    }
}
