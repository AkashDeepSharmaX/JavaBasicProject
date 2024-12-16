import java.util.Scanner;

public class BankManagement {

    // Method to check if the account exists
    public int check_account(int account_number, int accounts[]) {
        for (int i = 0; i < accounts.length; i++) {
            if (account_number == accounts[i]) {
                return i; // Return the index of the account if found
            }
        }
        return -1; // Return -1 if the account is not found
    }

    public static void main(String[] args) {
        // Dummy data for accounts and balances 
        int[] Acc = {101, 102, 103};
        int[] Balance = {5000, 70000, 91103};

        // Welcome message
        System.out.println("Welcome to the Bank");
        System.out.println("Enter your bank account number:");

        // Get user input
        Scanner sc = new Scanner(System.in);
        int account_number = sc.nextInt();

        // Create an instance of BankManagement
        BankManagement bank = new BankManagement();

        // Check if the account exists
        int accountIndex = bank.check_account(account_number, Acc);
        int account_bance = Balance[accountIndex];

        if (accountIndex != -1) {
            // Account found
            System.out.println("Account number found: " + Acc[accountIndex]);
            System.out.println("Your current balance is: " + account_bance);
        } else {
            // Account not found
            System.out.println("The entered account number is incorrect or does not exist.");
        }

        // prompt user for other banking operations
        System.out.println("Enter 1 for deposit.");
        System.out.println("Enter 2 for withdrawl.");
        int operation = sc.nextInt();
        if (operation == 1){
            System.out.println("You chose deposit");
            System.out.println("Enter amount you want to deposit");
            int deposit_amount = sc.nextInt();
            account_bance = account_bance + deposit_amount;
            System.out.println("Your final balance is "+ account_bance);
        }
        if (operation == 2){
            System.out.println("You chose withdrawl");
            System.out.println("Enter amount you wan to withdraw");
            int withdrawl_amount = sc.nextInt();
            if (withdrawl_amount > account_bance){
                System.out.println("incorrect amount.");
            }else{
                account_bance = account_bance - withdrawl_amount;
            }
            System.out.println("Your final balance is "+ account_bance);

        }

        sc.close(); // Close the scanner
    }
}
