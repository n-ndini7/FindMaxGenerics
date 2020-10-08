package FindMax;

//Test cases for given three Strings find maximum 
import static org.junit.Assert.*;
import org.junit.Test;

import com.FindMax.FindMax;

public class FindMaxTest {

	@Test
	public void MaxIntegerAtPositionOne_ReturnSameNumber() {
		FindMax<Integer> Obj = new FindMax<Integer>();
		Obj.findMaximum(9, 6, 2);
		assertEquals(9, (int) Obj.maximum());
		Obj.printMax();
	}

	@Test
	public void IntegerMaxAtPositionTwo_ReturnSameNumber() {
		FindMax<Integer> Obj = new FindMax<Integer>();
		Obj.findMaximum(6, 9, 2);
		assertEquals(9, (int) Obj.maximum());
		Obj.printMax();
	}

	@Test
	public void IntegerMaxAtPositionThree_ReturnSameNumber() {
		FindMax<Integer> Obj = new FindMax<Integer>();
		Obj.findMaximum(6, 2, 9);
		assertEquals(9, (int) Obj.maximum());
		Obj.printMax();
	}

	@Test
	public void VariableArgs_ReturnCorrectMax() {
		FindMax<Integer> Obj = new FindMax<Integer>();
		Obj.findMaximum(2, 6, 7, 9);
		assertEquals(9, (int) Obj.maximum());
		Obj.printMax();
	}

	// teset casess for integer
	@Test
	public void FloatMaxAtPositionOne_ReturnSameNumber() {
		FindMax<Float> Obj = new FindMax<Float>();
		Obj.findMaximum(9.9f, 6.6f, 2.2f);
		assertEquals(9.9f, (float) Obj.maximum(), 0.0f);
		Obj.printMax();
	}

	@Test
	public void FloatMaxAtPositionTwo_ReturnSameNumber() {
		FindMax<Float> Obj = new FindMax<Float>();
		Obj.findMaximum(6.6f, 9.9f, 2.2f);
		assertEquals(9.9f, (float) Obj.maximum(), 0.0f);
		Obj.printMax();
	}

	@Test
	public void FloatMaxAtPositionThree_ReturnSameNumber() {
		FindMax<Float> Obj = new FindMax<Float>();
		Obj.findMaximum(6.6f, 2.2f, 9.9f);
		assertEquals(9.9f, (float) Obj.maximum(), 0.0f);
		Obj.printMax();
	}

	@Test
	public void VariableFloatArgs_ReturnCorrectMax() {
		FindMax<Float> Obj = new FindMax<Float>();
		Obj.findMaximum(2.2f, 6.6f, 7.7f, 3.3f, 9.9f);
		assertEquals(9.9f, (float) Obj.maximum(), 0.0f);
		Obj.printMax();
	}

	// test cases for float integer
	@Test
	public void StringMaxAtPositionoOne_ReturnSameString() {
		FindMax<String> Obj = new FindMax<String>();
		Obj.findMaximum("Peach", "Apple", "Banana");
		assertEquals("Peach", Obj.maximum());
		Obj.printMax();
	}

	@Test
	public void StringMaxAtPositionTwo_ReturnSameString() {
		FindMax<String> Obj = new FindMax<String>();
		Obj.findMaximum("Apple", "Peach", "Banana");
		assertEquals("Peach", Obj.maximum());
		Obj.printMax();
	}

	@Test
	public void StringMaxAtPositionThree_ReturnSameString() {
		FindMax<String> Obj = new FindMax<String>();
		Obj.findMaximum("Apple", "Banana", "Peach");
		assertEquals("Peach", Obj.maximum());
		Obj.printMax();
	}

	@Test
	public void VariableStringArgs_ReturnCorrectMax() {
		FindMax<String> Obj = new FindMax<String>();
		Obj.findMaximum("Apple", "Banana", "Peach", "Ball", "Cat", "Bat");
		assertEquals("Peach", Obj.maximum());
		Obj.printMax();
	}
	// test cases for strings
}
