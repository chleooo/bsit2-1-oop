public class Main {
    public static void main(String[] args) {
        System.out.println("Bank Name: " + BankAccount.bankName);
        System.out.println("Interest Rate: " + (BankAccount.interestRate * 100) + "%");

        System.out.println();

        BankAccount account1 = new BankAccount("John Doe", 1000.0);
        BankAccount account2 = new BankAccount("Jane Smith", 2500.0);
        BankAccount account3 = new BankAccount("Bob Johnson", 500.0);

        System.out.println();
        System.out.println("═══ Account Operations ═══");
        account1.deposit(500.0);
        account2.withdraw(300.0);

        System.out.println();
        System.out.println("═══ Interest Calculation ═══");
        System.out.println(account1.accountHolderName + "'s interest: $" + account1.calculateInterest());
        System.out.println(account2.accountHolderName + "'s interest: $" + account2.calculateInterest());
        System.out.println(account3.accountHolderName + "'s interest: $" + account3.calculateInterest());

        System.out.println();
        System.out.println("Total Accounts Created: " + BankAccount.totalAccounts);
    }
}
class BankAccount {
    static String bankName = "LiceoBank";
    static int totalAccounts = 0;
    static double interestRate = 0.03;
    private static int accountCounter = 1;

    String accountNumber;
    String accountHolderName;
    double balance;

    public static String generateAccountNumber() {
        return String.format("ACC%03d", accountCounter++);
    }

    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        totalAccounts++;
        System.out.println("Account Created: " + accountNumber + " for " + accountHolderName +
                " with initial balance: $" + initialBalance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(accountHolderName + " deposited $" + amount + ". New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(accountHolderName + " withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient balance for " + accountHolderName);
        }
    }

    public double calculateInterest() {
        return balance * interestRate;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }
}

