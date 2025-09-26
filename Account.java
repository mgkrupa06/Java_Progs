package banking;

public class Account {

 private int accountNo;
 private String name;
 private double balance;

 public Account(int accountNo, String name, double balance) {
     this.accountNo = accountNo;
     this.name = name;
     this.balance = balance;
 }

 public void deposit(double amount) {
     if (amount <= 0) {
         throw new ArithmeticException("Deposit amount must be positive");
     }
     balance += amount;
     System.out.println("Amount deposited successfully");
 }

 public void withdraw(double amount) throws InsufficientBalanceException {
     if (amount <= 0) {
         throw new ArithmeticException("Withdrawal amount must be positive");
     }
     if (amount > balance) {
         throw new InsufficientBalanceException("Withdrawal failed: Insufficient balance");
     }
     balance -= amount;
     System.out.println("Amount withdrawn successfully.");
 }

 public void showBalance() {
     System.out.printf("Account No: %d | Name: %s | Current Balance: ₹%.2f\n", accountNo, name, balance);
 }
}
