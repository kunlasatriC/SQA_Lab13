package TEST;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import main.SumOfDigits;


class testSum {
	private SumOfDigits sumofdigits; 

	@Test
    public void testSumOfDigitsWithPositiveNumber() {
        int result = SumOfDigits.sumOfDigits(190);
        assertEquals(10, result);
    }
	
	@Test
    public void testSumOfDigitsWithNegativeNumber() {
        int result = SumOfDigits.sumOfDigits(190);
        assertEquals(10, result);
    }
	
	@Test
    public void testSumOfDigits0() {
        int result = SumOfDigits.sumOfDigits(0);
        assertEquals(0, result);
    }

}
