package cfranc.hanoi;

import org.junit.Test;

import static org.junit.Assert.*;

public class TourTest {

	@Test
	/**
	 * GIVEN_WHEN_THEN
	 */
	public void emplier_TourVide_True() {
		Tour tour = new Tour(3);
		boolean condition = tour.estVide();
		assertTrue(condition);
	}

	@Test
	/**
	 * GIVEN_WHEN_THEN
	 */
	public void emplier_TourPlein_True() {
		Tour tour = new Tour(3);
		Disque d1 = new Disque(1);
		Disque d2 = new Disque(2);
		Disque d3 = new Disque(3);

		tour.empiler(d3);
		tour.empiler(d2);
		tour.empiler(d1);

		boolean condition = tour.estPleine();
		assertTrue(condition);
	}

	@Test
	/**
	 * GIVEN_WHEN_THEN
	 */
	public void estPleine_true() {
		Tour tour = new Tour(3);
		Disque d1 = new Disque(1);
		Disque d2 = new Disque(2);
		Disque d3 = new Disque(3);

		tour.empiler(d3);
		tour.empiler(d2);
		tour.empiler(d1);

		boolean condition = tour.estPleine();
		assertTrue(condition);
	}

	@Test
	/**
	 * GIVEN_WHEN_THEN
	 */
	public void estPleine_false() {
		Tour tour = new Tour(3);
		Disque d2 = new Disque(2);
		Disque d3 = new Disque(3);

		tour.empiler(d3);
		tour.empiler(d2);

		boolean condition = tour.estPleine();
		assertFalse(condition);
	}

	@Test
	/**
	 * GIVEN_WHEN_THEN
	 */
	public void diam_DiametreDisqueSommet_Null() {
		Tour tour = new Tour(3);
		int expected = Integer.MAX_VALUE;
		int actual = tour.diam();
		assertEquals(expected, actual);
	}

	@Test
	/**
	 * GIVEN_WHEN_THEN
	 */
	public void diam_DiametreDisqueSommet_NotNull() {
		Tour tour = new Tour(3);
		Disque d1 = new Disque(1);
		Disque d2 = new Disque(2);
		Disque d3 = new Disque(3);

		tour.empiler(d3);
		tour.empiler(d2);
		tour.empiler(d1);

		int expected = 3;
		int actual = tour.diam();
		assertEquals(expected, actual);
	}
}
