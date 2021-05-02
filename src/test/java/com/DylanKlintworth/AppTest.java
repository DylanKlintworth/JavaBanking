package com.DylanKlintworth;

import static org.junit.Assert.assertTrue;
import com.DylanKlintworth.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
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


}
