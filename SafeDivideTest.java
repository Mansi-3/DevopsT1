import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SafeDivideTest {
    SafeDivide d;

    @BeforeEach
    void setup(){
        d = new SafeDivide();
    }

    @Test
    void testNormalCase(){
        assertEquals(2, d.divide(4,2));
    }

    @Test
    void testZero(){
        assertEquals(0, d.divide(0,4));
    }

    @Test
    void testDivideByZero(){
        assertThrows(ArithmeticException.class, () ->{
            d.divide(4,0);
        });
    }

    @Test
    void testNegativeValues(){
        assertEquals(-2, d.divide(-4,2));
    }


}
