package com.cbfacademy.accounts;

public class SavingsAccount extends Account {
    private double interest;

    public SavingsAccount(double balance, double accountNumber) {
        super(balance, accountNumber);
    }

    public double getInterest() {
        return interest;
    }

    public void addInterest() {
        if (this.balance > 0) {
            this.interest += this.balance;
        }
    }
}
