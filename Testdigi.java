import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testdigi {

	private SumOfDigits sumofdigits; 

	@Test
    public void testSumOfDigitsWithPositiveNumber() {
        int result = SumOfDigits.sumOfDigits(190);
        assertEquals(10, result);
    }

}
