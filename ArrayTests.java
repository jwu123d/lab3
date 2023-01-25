import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3, 2, 1, 0 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 0,1,2,3 }, input1);
	}
@Test
public void testReverseInPlace2() {
    int[] input1 = { 1, 2, 3, 1, 2, 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3, 2, 1, 3, 2, 1 }, input1);
}


  @Test
  public void testReversed() {
    int[] input1 = { 1 };
    assertArrayEquals(new int[]{ 1 }, ArrayExamples.reversed(input1));
  }

 @Test
 public void testAveragewithoutlowest() {
	 int [] input1 = { 1, 2 ,3 ,4}
	 assertEquals)3.0, ArrayExamples.averageWithoutLowest(input1), .1);

	}

  @Test
  public void testReversed1() {
	  int[] input2 = { 1, 2 ,3};
	  assertEquals(new int[]{ 3, 2, 1 }, ArrayExamples.reversed(input2));

	}
}
