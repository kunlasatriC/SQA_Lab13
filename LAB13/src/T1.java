import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class T1 {

	@Test
	@DisplayName("TS001")
	void testIntegerToRoman1(){
		int sum = main.sumDigits(200);
		assertEquals("2", sum);
	}
}
