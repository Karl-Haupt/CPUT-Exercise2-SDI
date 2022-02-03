package az.ac.cput;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

/* @author: Karl H - 220236585 */
// Allows a user to interact with their bank account

class BankAccountTest {
    private BankAccount bankAccount1;
    private BankAccount bankAccount2;
    private BankAccount bankAccount3;

    @BeforeEach
    void setUp() {
        bankAccount1 = new BankAccount("Jerry", "001");
        bankAccount2 = new BankAccount("Tom", "002");
        bankAccount3 = bankAccount1;
    }

//    Object Equality Test Case
    @Test
    void testBankAccountEquality() {
        assertEquals(bankAccount1, bankAccount3);
    }

//    Object Identity Test Case
    @Test
    void testBankAccountIdentity() {
        assertSame(bankAccount1, bankAccount2);
    }

//    Fail Test Cases
    @Test
    void testWithdraw() {
        int amountWithdraw = 120;
        assertSame(amountWithdraw, bankAccount1.withdraw(100));
    }

    @Test
    void testFailWithdraw() {
        fail("Fail test cases before withdraw - Security Issue");
    }

//    Timeout Test Case
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    public void testTimoutBankAccount() {
        assertEquals(bankAccount1, bankAccount3);
    }

//    Disabled Test Case
    @Test
    @Disabled("Disabled - Method needs refactoring, remove Print statement")
    public void testPreviousTransaction() {
        assertSame(bankAccount1.getPreviousTransaction(), bankAccount3.getPreviousTransaction());
    }

//    @AfterEach
//    void tearDown() {
//    }

}