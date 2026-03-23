import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class StudentServiceTest {
    StudentService marks;

    @BeforeEach
    void setup(){
        marks = new StudentService();
    }

    @Test
    void testaddMarks(){
        assertEquals(60, marks.addMarks(20,10,30));
    }

    @Test
    void testCalculatePercentage(){
        assertEquals(60,marks.calculatePercentage(180));
    }

    @Test
    void testNegativeMarks(){
        assertThrows(IllegalArgumentException.class, () -> marks.calculatePercentage(-30));
    }

    @Test
    void testCalculateGrade(){
        assertEquals("A",marks.calculateGrade(95));
        assertEquals("B", marks.calculateGrade(80));
        assertEquals("C", marks.calculateGrade(67));
        assertEquals("Fail",marks.calculateGrade(20));
    }

    @Test
    void testInvalidPercentage(){
        assertThrows(IllegalArgumentException.class, () -> marks.calculateGrade(-30));
    }

    @Test
    void testPass(){
        assertTrue(marks.isPass(70));
    }

    @Test
    void testFail(){
        assertFalse(marks.isPass(25));
    }

    @Test
    void testValidateMarks(){
        assertTrue(marks.validateMarks(50));
    }

    @Test
    void testInvalidMarks(){
        assertFalse(marks.validateMarks(-40));
    }

    @Test
    void testInvalidMarksAbove100(){
        assertFalse(marks.validateMarks(140));
    }

    @AfterEach
void tearDown(){
    marks = null;
}
}
