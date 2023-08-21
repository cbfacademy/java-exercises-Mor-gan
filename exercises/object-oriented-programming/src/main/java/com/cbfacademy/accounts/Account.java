package com.cbfacademy.accounts;

public class Account {

    protected double balance;
    protected double accountNumber;

    public Account(double balance, double accountNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
        public double getBalance() {
            return balance;
        }
    
        public double getAccountNumber() {
            return accountNumber;
        }
       
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }
        public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
    
}
