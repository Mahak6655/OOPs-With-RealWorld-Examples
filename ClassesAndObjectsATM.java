import java.util.*;

class ATM {
float accountBalance;
int atmPin = 6655;


// Verify PIN
public void verifyPin() {
    System.out.print("Enter PIN: ");
    Scanner sc = new Scanner(System.in);

    int enteredPin = sc.nextInt();

    if (enteredPin == atmPin) {
        System.out.println("PIN Verified Successfully.");
        displayMenu();
    } else {
        System.out.println("Invalid PIN. Try Again.");
        verifyPin();
    }
}

// Display ATM Menu
public void displayMenu() {
    System.out.println("\n===== ATM MENU =====");
    System.out.println("1. Check Balance");
    System.out.println("2. Deposit Money");
    System.out.println("3. Withdraw Money");
    System.out.println("4. Exit");

    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();

    if (choice == 1) {
        checkBalance();
    } else if (choice == 2) {
        depositMoney();
    } else if (choice == 3) {
        withdrawMoney();
    } else if (choice == 4) {
        return;
    } else {
        System.out.println("Please Enter a Valid Choice.");
        displayMenu();
    }
}

// Check Account Balance
public void checkBalance() {
    System.out.println("Current Balance: " + accountBalance);
    displayMenu();
}

// Deposit Money
public void depositMoney() {
    System.out.print("Enter Amount to Deposit: ");
    Scanner sc = new Scanner(System.in);

    float depositAmount = sc.nextFloat();

    accountBalance += depositAmount;
    System.out.println("Amount Deposited Successfully.");

    displayMenu();
}

// Withdraw Money
public void withdrawMoney() {
    System.out.print("Enter Amount to Withdraw: ");
    Scanner sc = new Scanner(System.in);

    float withdrawalAmount = sc.nextFloat();

    if (withdrawalAmount > accountBalance) {
        System.out.println("Insufficient Balance.");
    } else {
        accountBalance -= withdrawalAmount;
        System.out.println("Amount Withdrawn Successfully.");
    }

    displayMenu();
}
}

public class ClassesAndObjectsATM {
public static void main(String[] args) {


    // Creating ATM Object
    ATM atm = new ATM();

    // Starting ATM System
    atm.verifyPin();
}
}

