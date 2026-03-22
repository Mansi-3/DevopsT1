import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    Factorial f;

    @BeforeEach
    void setup(){
        f = new Factorial();
    }

    @Test
    void testFactorialofFive(){
        assertEquals(120, f.factorial(5));
    }

    @Test
    void testFactorialofZero(){
        assertEquals(1,f.factorial(0));
    }

    @Test
    void testFactorialofOne(){
        assertEquals(1,f.factorial(1));
    }

    @Test
    void testNegativeInput(){
        assertThrows(IllegalArgumentException.class, () -> {
            f.factorial(-5);
        });
    }

    @Test
    void assertFactorialPositive(){
        f = new Factorial();
        int result = f.factorial(5);
        assertTrue(result>0);
    }
}
