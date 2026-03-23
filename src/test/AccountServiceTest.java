package src.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.code.AccountService;

public class AccountServiceTest {
    AccountService A ;

    @BeforeAll
    static void setupAll(){
        System.out.println("Start Test");
    }
    
    @BeforeEach
    void setup(){
        A = new AccountService();
    }


    @Test
    void testDeposit(){
        assertEquals(5000, A.deposit(2000,3000));
    }

    @Test
    void testInvalidDeposit(){
        assertThrows(IllegalArgumentException.class, () -> A.deposit(3000,-5000));
    }

    @Test
    void testWithdraw(){
        assertEquals(2000,A.withdraw(4000,2000 ));
    }

    @Test
    void testInvalidWithdraw(){
        assertThrows(ArithmeticException.class, () -> A.withdraw(2000,5000));
    }

    @Test
    void testMinBalance(){
        assertTrue(A.isMinimumBalance(2000));
    }

    @Test 
    void testNotMinBalance(){
        assertFalse(A.isMinimumBalance(100));
    }

    @Test
    void testCalculateInterest(){
        assertEquals(100, A.calculateInterest(1000));
    }

    @Test
    void testInvalidBalance(){
        assertThrows(IllegalArgumentException.class, ()-> A.calculateInterest(-10));
    }

     @Test
    void testZeroBalance(){
        assertEquals(0, A.calculateInterest(0));
    }

    @AfterEach
    void tearDown(){
        A = null;
    }

    @AfterAll
    static void tearDownAll(){
        System.out.println("All test completed");
    }

}
