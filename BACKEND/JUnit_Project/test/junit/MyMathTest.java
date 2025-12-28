package junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MyMathTest {

	private MyMath math = new MyMath();
	@Test
	void calculateSum_threeLength() {
		assertEquals(6, math.getValue(new int[] {1,2,3}));
	}
	
	@Test
	void calculateSum_zeroLength() {
		assertEquals(0, math.getValue(new int[] {}));
	}

}
