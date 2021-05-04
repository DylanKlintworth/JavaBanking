package com.JavaBanking;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class BankAccountTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void defaultBankAccountConstructor(){
        BankAccount testBankAccount = new BankAccount();
        assertTrue(testBankAccount.getBalance() == 0);
    }

    @Test
    public void balanceBankAccountConstructor(){
        BankAccount testBankAccount = new BankAccount(200);
        assertTrue(testBankAccount.getBalance() == 200);
    }

    @Test
    public void balanceAccountNumberConstructor(){
        BankAccount testBankAccount = new BankAccount(200, 1234);
        assertTrue(testBankAccount.getBalance() == 200 && testBankAccount.getAccountNumber() == 1234);
    }

    @Test
    public void getBalanceTest(){
        BankAccount testBankAccount = new BankAccount((float) 500.5);
        float newBalance = testBankAccount.getBalance();
        assertTrue(newBalance == 500.50);
    }

    @Test
    public void getAccountNumberTest() {
        BankAccount testBankAccount = new BankAccount(500, 1234);
        float accountNum = testBankAccount.getAccountNumber();
        assertTrue(accountNum == 1234);
    }
    @Test
    public void setBalanceTest(){
        BankAccount testBankAccount = new BankAccount(500, 1234);
        testBankAccount.setBalance(20);
        float compareValue = 20;
        assertTrue(compareValue == testBankAccount.getBalance());
    }

    @Test
    public void setAccountNumberTest(){
        BankAccount testBankAccount = new BankAccount(500, 1234);
        testBankAccount.setAccountNumber(1);
        float compareValue = 1;
        assertTrue(compareValue == testBankAccount.getAccountNumber());
    }

    @Test
    public void depositTest(){
        float depositAmount = 20.5F;
        BankAccount testBankAccount = new BankAccount(500, 1234);
        float endingValue = 520.5F;
        testBankAccount.deposit(depositAmount);
        assertTrue(endingValue == testBankAccount.getBalance());
    }

    @Test
    public void withdrawInsufficientFundsTest(){
        float withdrawAmount = 520F;
        BankAccount testBankAccount = new BankAccount(500, 1234);
        boolean result = false;
        try {
            testBankAccount.withdraw(withdrawAmount);
        } catch (Exception e) {
            result = true;
        }
        assertTrue(result);
    }

    @Test
    public void withdrawTest(){
        float withdrawAmount = 480F;
        float endingAmount = 20F;
        BankAccount testBankAccount = new BankAccount(500, 1234);
        try {
            testBankAccount.withdraw(withdrawAmount);
        } catch (Exception e) {

        }
        assertTrue(endingAmount == testBankAccount.getBalance());
    }

    @Test
    public void toStringTest(){
        String result = "BankAccount{balance=500.0, accountNumber=1234}";
        BankAccount testBankAccount = new BankAccount(500, 1234);
        String toString = testBankAccount.toString();
        assertEquals(result, toString);
    }

}
