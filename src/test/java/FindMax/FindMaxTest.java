package FindMax;

import static org.junit.Assert.*;
import org.junit.Test;

import com.FindMax.FindMax;

public class FindMaxTest {

	@Test
	public void MaxAtPositionOne_ReturnSameNumber() {
		int max = FindMax.Maximum(9, 6, 2);
		assertEquals(9, max);
	}

	@Test
	public void MaxAtPositionTwo_ReturnSameNumber() {
		int max = FindMax.Maximum(6, 9, 2);
		assertEquals(9, max);
	}

	@Test
	public void MaxAtPositionThree_ReturnSameNumber() {
		int max = FindMax.Maximum(6, 2, 9);
		assertEquals(9, max);
	}
}
