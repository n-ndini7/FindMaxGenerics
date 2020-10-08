package FindMax;

//Test cases for given three Strings find maximum 
import static org.junit.Assert.*;
import org.junit.Test;

import com.FindMax.FindMax;

public class FindMaxTest {

	@Test
	public void MaxAtPositionOne_ReturnSameNumber() {
		String max = FindMax.Maximum("Peach", "Apple", "Banana");
		assertEquals("Peach", max);
	}

	@Test
	public void MaxAtPositionTwo_ReturnSameNumber() {
		String max = FindMax.Maximum("Apple", "Peach", "Banana");
		assertEquals("Peach", max);
	}

	@Test
	public void MaxAtPositionThree_ReturnSameNumber() {
		String max = FindMax.Maximum("Apple", "Banana", "Peach");
		assertEquals("Peach", max);
	}
}
