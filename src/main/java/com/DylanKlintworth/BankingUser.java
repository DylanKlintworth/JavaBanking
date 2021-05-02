package com.DylanKlintworth;

public interface BankingUser {
    public void deposit(float value);
    public float withdraw(float value) throws Exception;
}
