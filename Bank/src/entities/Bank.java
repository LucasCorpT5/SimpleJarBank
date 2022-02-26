package entities;

public class Bank {
    public double account;
    public int accountNumber;
    public String accountHolder;
    public double initialDeposit;
    public double deposit;
    public String yesorno;
    public double saque;

    public double enterInitialDeposit() {
        return initialDeposit + account;
    }
}
