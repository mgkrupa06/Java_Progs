package banking;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Simple Bank!");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        int accountNo = 1001;
        double initialBalance = 0;

        try {
            System.out.print("Enter initial deposit (₹): ");
            initialBalance = sc.nextDouble();
            if (initialBalance < 0) {
                System.out.println("Initial balance cannot be negative. Setting to ₹0.");
                initialBalance = 0;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Initial balance set to ₹0.");
            sc.nextLine();
        }

        Account acc = new Account(accountNo, name, initialBalance);

        int choice = 0;
        do {
            System.out.println("\n Menu");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ₹");
                        double depositAmount = sc.nextDouble();
                        acc.deposit(depositAmount);
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ₹");
                        double withdrawAmount = sc.nextDouble();
                        acc.withdraw(withdrawAmount);
                        break;

                    case 3:
                        acc.showBalance();
                        break;

                    case 4:
                        System.out.println("Thank you, " + name + ", for using Simple Bank!");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter numeric input.");
                sc.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (InsufficientBalanceException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 4);

        sc.close();
    }
}
