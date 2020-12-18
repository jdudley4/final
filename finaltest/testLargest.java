package finaltest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testLargest  {
	private Largest temp1;
	
	@Test
	public void test() {
		testPositive();
	}
	public void testPositive(){
        int[] arr = new int[4];
        arr[0] = 11;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        temp1 = new Largest();
        int maxValue = temp1.largest(arr);
	/** add tests to check for this unit test **/
        assertEquals(arr[0], maxValue);
    }
	
	public void testNegative(){
        int[] arr = new int[4];
        arr[0] = -11;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        temp1 = new Largest();
        int maxValue = temp1.largest(arr);
	/** add tests to check for this unit test **/
        assertEquals(arr[2], maxValue);
        assertTrue(maxValue < 0);
    }

}

	
