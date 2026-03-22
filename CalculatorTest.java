import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator c;
    
   @BeforeEach
   void setup(){
     c = new Calculator();
   }

   @Test
   void testAdd(){
    assertEquals(5, c.add(2,3));
   }

   @Test
   void testNegativeInput(){
    assertNotEquals(10, c.add(2,3));
   }

   @Test
   void testZero(){
    assertEquals(0, c.add(0,0));
   }

   @Test
   void testDivide(){
    assertEquals(2, c.divide(10,5));
   }

   @Test
   void testDivideByZero(){
    assertThrows(ArithmeticException.class, () ->{
        c.divide(10,0);
    });
   }

   @AfterEach
   void tearDown(){
     c = null;
   }

}
