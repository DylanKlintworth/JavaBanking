package com.DylanKlintworth;

public class BankAccount implements BankingUser{
    private float balance;
    int accountNumber;

    public BankAccount(){
        balance = 0;
    }

    public BankAccount(float balance){
        this.balance = balance;
    }

    public BankAccount(float balance, int accountNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                '}';
    }

    public float withdraw(float value) throws Exception {
        if (value > balance){
            throw new Exception("Insufficient Funds");
        } else {
            balance -= value;
        }
        return balance;
    }

    public void deposit(float value){
        balance += value;
    }

}
