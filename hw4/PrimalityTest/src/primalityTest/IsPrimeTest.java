package primalityTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class IsPrimeTest {

	@Test
	public void test() {
		assertFalse(IsPrime.isPrime(1));
		assertTrue(IsPrime.isPrime(2));
		assertTrue(IsPrime.isPrime(3));
		assertFalse(IsPrime.isPrime(4));
		assertTrue(IsPrime.isPrime(65537));
	}
}