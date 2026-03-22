import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaxNumberTest {
    
    MaxNumber c;

    @BeforeEach
    void setup(){
        c = new MaxNumber();
    }
    
    @Test
    void testNormalCase(){
        assertEquals(5, c.findMax(5,3));
    }

    @Test
    void testReverseCase(){
        assertEquals(5, c.findMax(3, 5));
    }

    @Test
    void testNegativeCase(){
        assertEquals(-3, c.findMax(-5,-3));
    }

    @Test
    void testAssertTrue(){
        assertTrue(c.findMax(5,3) == 5);
    }

    @Test
    void testAssertFalse(){
        assertFalse(c.findMax(5,3) == 3);
    }

    @AfterEach
    void teardown(){
        c = null;
    }
}
