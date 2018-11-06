import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PrimeFactorsTest {
	@Test
	public void test() {
		assertPrimeFactors(1, listOf());
		assertPrimeFactors(2, listOf(2));
		assertPrimeFactors(3, listOf(3));
		assertPrimeFactors(4, listOf(2, 2));
		assertPrimeFactors(5, listOf(5));
		assertPrimeFactors(6, listOf(2, 3));
		assertPrimeFactors(7, listOf(7));
		assertPrimeFactors(8, listOf(2, 2, 2));
		assertPrimeFactors(9, listOf(3, 3));
		assertPrimeFactors(2 * 2 * 3 * 5 * 5 * 5 * 7, listOf(2, 2, 3, 5, 5, 5, 7));
	}

	private void assertPrimeFactors(int n, List<Integer> list) {
		assertEquals(list, of(n));
	}

	private List<Integer> listOf(Integer... integers) {
		return Arrays.asList(integers);
	}

	private List<Integer> of(int n) {
		List<Integer> factors = new ArrayList<Integer>();
		for (int divisor = 2; n > 1; divisor++) {
			for (; n % divisor == 0; n /= divisor) {
				factors.add(divisor);
			}
		}
		return factors;
	}
}
