package FindMax;

//Test cases for given three float find maximum 
import static org.junit.Assert.*;
import org.junit.Test;

import com.FindMax.FindMax;

public class FindMaxTest {

	@Test
	public void MaxAtPositionOne_ReturnSameNumber() {
		Float max = FindMax.Maximum(9.9f, 6.6f, 2.2f);
		assertEquals(9.9f, max, 0.0);
	}

	@Test
	public void MaxAtPositionTwo_ReturnSameNumber() {
		Float max = FindMax.Maximum(6.6f, 9.9f, 2.2f);
		assertEquals(9.9f, max, 0.0);
	}

	@Test
	public void MaxAtPositionThree_ReturnSameNumber() {
		Float max = FindMax.Maximum(6.6f, 2.2f, 9.9f);
		assertEquals(9.9f, max, 0.0);
	}
}
