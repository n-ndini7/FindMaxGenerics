package FindMax;

//Test cases for given three Strings find maximum 
import static org.junit.Assert.*;
import org.junit.Test;

import com.FindMax.FindMax;

public class FindMaxTest {

	@Test
	public void StringMaxAtPositionOne_ReturnSameNumber() {
		String max = FindMax.Maximum("Peach", "Apple", "Banana");
		assertEquals("Peach", max);
	}

	@Test
	public void StringMaxAtPositionTwo_ReturnSameNumber() {
		String max = FindMax.Maximum("Apple", "Peach", "Banana");
		assertEquals("Peach", max);
	}

	@Test
	public void StringMaxAtPositionThree_ReturnSameNumber() {
		String max = FindMax.Maximum("Apple", "Banana", "Peach");
		assertEquals("Peach", max);
	}

	// test cases for string
	public void IntegerMaxAtPositionOne_ReturnSameNumber() {
		int max = FindMax.Maximum(9, 6, 2);
		assertEquals(9, max);
	}

	@Test
	public void IntegerMaxAtPositionTwo_ReturnSameNumber() {
		int max = FindMax.Maximum(6, 9, 2);
		assertEquals(9, max);
	}

	@Test
	public void IntegerMaxAtPositionThree_ReturnSameNumber() {
		int max = FindMax.Maximum(6, 2, 9);
		assertEquals(9, max);
	}
	// test cases for integer

	@Test
	public void FloatMaxAtPositionOne_ReturnSameNumber() {
		Float max = FindMax.Maximum(9.9f, 6.6f, 2.2f);
		assertEquals(9.9f, max, 0.0);
	}

	@Test
	public void FloatMaxAtPositionTwo_ReturnSameNumber() {
		Float max = FindMax.Maximum(6.6f, 9.9f, 2.2f);
		assertEquals(9.9f, max, 0.0);
	}

	@Test
	public void FloatMaxAtPositionThree_ReturnSameNumber() {
		Float max = FindMax.Maximum(6.6f, 2.2f, 9.9f);
		assertEquals(9.9f, max, 0.0);
	}
	// teset cases for float

}
