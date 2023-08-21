package com.cbfacademy.accounts;

public class SavingsAccount extends Account {
    protected double interest;

    public SavingsAccount(double balance, double accountNumber) {
        super(balance, accountNumber);
    }

    protected double getInterest(){
        return  interest;
    }

    @Override protected double addInterest() {
        if (balance > 0) {
            return interest + balance;
        }
    }
}
