import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // java banking program for beginners

        //variables
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            //display a menu choice
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            //get and process users choice
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
        }
        System.out.println("*************************************************");
        System.out.println("Thank you for using our program! Have a nice day!");
        System.out.println("*************************************************");

        //exit message
        scanner.close();
    }
    // showBalance()
    static void showBalance(double balance){
        System.out.println("***************");
        System.out.printf("Your balance is $%.2f\n", balance);
    }
    //deposit()
    static double deposit(){
        System.out.println("***************");
        double amount;
        System.out.println("Please enter the amount you would like to deposit: ");
        amount = scanner.nextDouble();
        if (amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
    //withdraw()
    static double withdraw(double balance){
        double amount;
        System.out.print("Please enter the amount you would like to withdraw: ");
        amount = scanner.nextDouble();
        if (amount > balance){
            System.out.print("INSUFFICIENT AMOUNT\n");
        } else if (amount < 0) {
            System.out.print("Amount can't be negative\n");
        }
        else {
            return amount;
        }
        return 0;
    }
}