import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeCalculatorTest {
    
    GradeCalculator gc;
    
    @BeforeEach
    void Setup(){
        gc = new GradeCalculator();
    }

    @Test
    void testNormalString(){
        assertEquals("A", gc.getGrade(95));
    }

    @Test
    void testGradeA(){
        assertEquals("A", gc.getGrade(95));
    }

    @Test
    void testGradeB(){
        assertEquals("B", gc.getGrade(80));
    }

    @Test
    void testGradeC(){
        assertEquals("C", gc.getGrade(60));
    }

    @Test
    void fail(){
        assertEquals("Fail", gc.getGrade(40));
    }

    @Test
    void testInvalidMarks(){
        assertThrows(IllegalArgumentException.class, () ->{
            gc.getGrade(-5);
        });
    }

}
