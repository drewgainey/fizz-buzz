package fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

	FizzBuzz underTest = new FizzBuzz();

	@Test
	public void shouldRespond1WhenUserEnters1() {
		String result = underTest.response(1);
		assertEquals("1", result);
	}

	@Test
	public void shouldRespond2WhenUserEnters2() {
		String result = underTest.response(2);
		assertEquals("2", result);
	}

	@Test
	public void shouldRespondFizzWhenUserEnters3() {
		String result = underTest.response(3);
		assertEquals("Fizz", result);

	}

	@Test
	public void shouldRespondBuzzWhenUserEnters5() {
		String result = underTest.response(5);
		assertEquals("Buzz", result);

	}

	@Test
	public void shouldRespondFizzWhenUserEnters6() {
		String result = underTest.response(6);
		assertEquals("Fizz", result);

	}
	@Test
	public void shouldRespondBuzzWhenUserEnters10() {
		String result = underTest.response(10);
		assertEquals("Buzz", result);

	}
	@Test
	public void shouldRespondFizzWhenUserEnters15() {
		String result = underTest.response(15);
		assertEquals("FizzBuzz", result);

	}

}
