package FindMax;

//Test cases for given three Strings find maximum 
import static org.junit.Assert.*;
import org.junit.Test;

import com.FindMax.FindMax;

public class FindMaxTest {

	FindMax obj;

	@Test
	public void StringMaxAtPositionOne_ReturnSameNumber() {
		obj = new FindMax<String>("Peach", "Apple", "Banana");
		obj.Maximum();
		assertEquals("Peach", obj.Maximum());
	}

	@Test
	public void StringMaxAtPositionTwo_ReturnSameNumber() {
		obj = new FindMax<String>("Apple", "Peach", "Banana");
		obj.Maximum();
		assertEquals("Peach", obj.Maximum());
	}

	@Test
	public void StringMaxAtPositionThree_ReturnSameNumber() {
		obj = new FindMax<String>("Apple", "Banana", "Peach");
		obj.Maximum();
		assertEquals("Peach", obj.Maximum());
	}

	// test cases for string
	public void IntegerMaxAtPositionOne_ReturnSameNumber() {
		obj = new FindMax<Integer>(9, 6, 2);
		obj.Maximum();
		assertEquals(9, obj.Maximum());
	}

	@Test
	public void IntegerMaxAtPositionTwo_ReturnSameNumber() {
		obj = new FindMax<Integer>(6, 9, 2);
		obj.Maximum();
		assertEquals(9, obj.Maximum());
	}

	@Test
	public void IntegerMaxAtPositionThree_ReturnSameNumber() {
		obj = new FindMax<Integer>(6, 2, 9);
		obj.Maximum();
		assertEquals(9, obj.Maximum());

	}
	// test cases for integer

	@Test
	public void FloatMaxAtPositionOne_ReturnSameNumber() {
		obj = new FindMax<Float>(9.9f, 6.6f, 2.2f);
		obj.Maximum();
		assertEquals(9.9f, obj.Maximum());

	}

	@Test
	public void FloatMaxAtPositionTwo_ReturnSameNumber() {
		obj = new FindMax<Float>(6.6f, 9.9f, 2.2f);
		obj.Maximum();
		assertEquals(9.9f, obj.Maximum());
	}

	@Test
	public void FloatMaxAtPositionThree_ReturnSameNumber() {
		obj = new FindMax<Float>(6.6f, 2.2f, 9.9f);
		obj.Maximum();
		assertEquals(9.9f, obj.Maximum());

	}
	// test cases for float

}
