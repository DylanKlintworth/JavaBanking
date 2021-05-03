package com.JavaBanking;

public interface BankingUser {
    public void deposit(float value);
    public float withdraw(float value) throws Exception;
}
