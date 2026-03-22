import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class StringUtilTest {
  StringUtil su;
  
  @BeforeEach
  void setup(){
    su = new StringUtil();
  }

  @Test
  void testNormalString(){
    assertEquals("cba", su.reverse("abc"));
  }

  @Test
  void testSingleChar(){
    assertEquals("a", su.reverse("a"));
  }

  @Test
  void testEmptyString(){
    assertEquals("",su.reverse(""));
  }

  @Test
  void testPalindrome(){
    assertEquals("aabaa", su.reverse("aabaa"));
  }

  @Test
  void testNullInput(){
    assertThrows(NullPointerException.class , () -> 
    su.reverse(null));
  }

  @AfterAll
  static void tearDown(){
    System.out.println("All test completed");
  }


}
