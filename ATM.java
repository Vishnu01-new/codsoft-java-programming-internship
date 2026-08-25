import java.util.Scanner;

// Class to represent the user's bank account
class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. ₹" + amount + " added to your account.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. ₹" + amount + " withdrawn.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Your current balance is: ₹" + balance);
    }
}

// Class to represent the ATM Machine
class ATM {
    private BankAccount account;

    // Constructor
    public ATM(BankAccount account) {
        this.account = account;
    }

    // Method to display menu
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== ATM Menu ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}

// Main class to run the program
public class Atm {
    public static void main(String[] args) {
        // Initial balance is ₹1000
        BankAccount myAccount = new BankAccount(1000);
        ATM atmMachine = new ATM(myAccount);
        atmMachine.displayMenu();
    }
}
