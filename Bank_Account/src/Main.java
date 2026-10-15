import java.util.*;
class BankAccount{

    private String accountholder;
    private String accountnumber;
    private double balance;

    BankAccount(String acccountholder, String accountnumber, double balance){
        this.accountholder = acccountholder;
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void SetAccountholder(String name){
        if (name != null && !name.isBlank()){
            this.accountholder = name;
        }else {
            System.out.println("invalid name");
        }
    }
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("deposit successful");
        }else {
            System.out.println("invalid deposit amount");
        }
    }
    public void withdraw(double amount){
        if (amount <= 0){
            System.out.println("invalid withdraw amount ");
        } else if (amount<=balance){
            balance -= amount;
            System.out.println("Withdrawal successful");
//            System.out.println("your remaining amount is "+balance);
        }else {
            System.out.println("insufficient balance ");
        }
    }
    public void DisplayDetails(){
        System.out.println("accountholder "+accountholder);
        System.out.println("account number"+accountnumber);
        System.out.println("balance "+balance);
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter account number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter opening balance: ");
        double balance = sc.nextDouble();

        if (balance < 0) {
            System.out.println("Opening balance cannot be negative.");
            sc.close();
            return;
        }

        BankAccount account = new BankAccount(name, accountNumber, balance);

        int choice;

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.println(
                            "Current Balance: " + account.getBalance()
                    );
                    break;

                case 4:
                    account.DisplayDetails();
                    break;

                case 5:
                    System.out.println("Thank you for using our bank!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        sc.close();





//        BankAccount bc = new BankAccount("rahul", "rahul321", 20000);
//        bc.deposit(6000);
//        bc.withdraw(5000);
//        bc.DisplayDetails();

    }
}

