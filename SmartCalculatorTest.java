import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SmartCalculatorTest {
    SmartCalculator sc ;

    @BeforeEach
    void setup(){
        sc = new SmartCalculator();
    }
    
    @Test
    void testAdd(){
        assertEquals(5, sc.add(2,3));
    }
    
    @Test
    void testNegativeInput(){
        assertEquals(-2, sc.add(-5,3));
    }

    @Test
    void testDivide(){
        assertEquals(4,sc.divide(20,5));
    }

    @Test
    void testDivideByZero(){
        assertThrows(ArithmeticException.class, ()->{
            sc.divide(20,0);
        });
    }

    @Test
    void testEvenNumber(){
        assertTrue(sc.isEven(4));
    }
    
    @Test
    void testOddNumber(){
        assertFalse(sc.isEven(7));
    }

    @Test
    void testMax(){
        assertEquals(9,sc.findMax(9,8));
    }

    @Test
    void testMaxNegative(){
        assertNotEquals(7,sc.findMax(7,9));
    }

    @Test
    void testEquals(){
        assertEquals(5, sc.findMax(5,5));
    }

    @Test
    void testForNegativeNumbers(){
        assertEquals(-2,sc.findMax(-2,-5));
    }

    @Test
    void testFactorial(){
        assertEquals(24,sc.factorial(4));
    }

    @Test
    void testFactorialOfZero(){
        assertEquals(1,sc.factorial(0));
    }

    @Test
    void testFactorialOfNegative(){
        assertThrows(IllegalArgumentException.class, ()->{
            sc.factorial(-5);
        });
    }


    @AfterEach
    void tearDown(){
        System.out.println("All test completed");
    }

}
