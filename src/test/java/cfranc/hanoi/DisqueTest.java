package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisqueTest {

	@Test
	/**
	 * GIVEN_WHEN_THEN
	 */
	public void compareTo_Small_To_Medium_negative() {
		Disque dSmall = new Disque(1);
		Disque dMedium = new Disque(2);

		int expected = -1;
		int actual = dSmall.compareTo(dMedium);
		assertEquals(expected, actual);
	}

	@Test
	/**
	 * GIVEN_WHEN_THEN
	 */
	public void compareTo_Medium_To_Small_negative() {
		Disque dSmall = new Disque(1);
		Disque dMedium = new Disque(2);

		int expected = 1;
		int actual = dMedium.compareTo(dSmall);
		assertEquals(expected, actual);
	}

	@Test
	/**
	 * GIVEN_WHEN_THEN
	 */
	public void compareTo_SmallMedium_Negative(){
		Disque dSmall = new Disque(1);

		int expected = 0;
		int actual = dSmall.compareTo(dSmall);
		assertEquals(expected, actual);
	}
}
