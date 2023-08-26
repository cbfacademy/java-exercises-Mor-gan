package com.cbfacademy.accounts;

public class Account {

    protected double balance;
    private double accountNumber;

    public Account(double balance, double accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAccountNumber() {
        return this.accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withDraw(double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
        }
    }

}
