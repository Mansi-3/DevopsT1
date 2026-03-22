import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NumberCheckTest {
    NumberCheck n;

    @BeforeEach
    void setup(){
        n = new NumberCheck();
    }

    @Test
    void testEvenNumber(){
        assertTrue( n.ifEven(4));
    }

    @Test
    void testOddNumber(){
        assertFalse(n.ifEven(9));
    }

    @Test
    void testZero(){
        assertTrue(n.ifEven(0));
    }

    @Test
    void testNegativeNumber(){
        assertTrue(n.ifEven(-4));
    }

    @AfterAll
    static void tearDown(){
        System.out.println("All test completed");
    }
}
