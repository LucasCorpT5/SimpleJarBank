import entities.Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        bank.accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        bank.accountHolder = sc.next();
        System.out.print("Is there an initial deposit (y/s)? ");
        bank.yesorno = sc.next();

        switch(bank.yesorno) {
            case "y":
                System.out.print("Enter initial deposit value: ");
                bank.initialDeposit = sc.nextDouble();
                bank.account += bank.initialDeposit;
                System.out.println();
                System.out.println("Account data: ");
                System.out.printf("Account " + bank.accountNumber + ", Holder: " + bank.accountHolder + ", Balance: $ %.2f", bank.account);
                System.out.println();
                System.out.println();
                System.out.print("Enter a deposit value: ");
                bank.deposit = sc.nextDouble();
                System.out.println();
                bank.account += bank.deposit;
                System.out.println("Updated account data: ");
                System.out.printf("Account " + bank.accountNumber + ", Holder: " + bank.accountHolder + ", Balance: $ %.2f", bank.account);
                System.out.println();
                System.out.println();
                System.out.print("Enter a withdraw value: ");
                bank.saque = sc.nextDouble();
                // Tax -5 ex
                bank.account -= bank.saque - 5;
                System.out.println();
                System.out.println("Updated account data: ");
                System.out.printf("Account " + bank.accountNumber + ", Holder: " + bank.accountHolder + ", Balance: $ %.2f", bank.account);
                break;
            case "n":
                break;
        }
    }
}
