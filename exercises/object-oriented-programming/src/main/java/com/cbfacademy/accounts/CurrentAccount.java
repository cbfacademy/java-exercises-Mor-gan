package com.cbfacademy.accounts;

public class CurrentAccount extends Account {
    protected double overDraft;

    public CurrentAccount(double balance, double accountNumber) {
        super(balance, accountNumber);
    }

    protected double allowOverdraft() {
        return this.overDraft;
}
}
