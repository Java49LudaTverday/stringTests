package telran.string.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class StringTests {

	@Test
	void testCharAt() {
		assertEquals('H', "Hello".charAt(0));
		assertEquals('a', "Luda".charAt(3));

	}

	@Test
	@Disabled
	void testCharAtIndexExceptions() {
		assertEquals("H", "Hello".charAt(-1));
		assertEquals("a", "Luda".charAt(5));
		assertEquals("", "".charAt(0));
	}

	@Test
	void testCompareTo() {
		assertEquals(0, "telran".compareTo("telran"));
		assertEquals(5, "night".compareTo(""));
		assertEquals(-5, "".compareTo("night"));
		assertEquals(16, "summer".compareTo("season"));
		assertEquals(-32, "HELLO".compareTo("hello"));
		assertEquals(-2, "look".compareTo("lookss"));
		assertEquals(-5, "3".compareTo("8"));
		assertTrue("Compare".compareTo("Compare") == 0);
	}

	@Test
	@Disabled
	void testCompareToExceptions() {
		assertEquals(1, "day".compareTo(null));
	}

	@Test
	void testCompareToIgnoreCase() {
		assertEquals(0, "MINSK".compareToIgnoreCase("minsk"));
		assertEquals(-3, "Music".compareToIgnoreCase("musicsss"));
	}

	@Test
	void testConcat() {
		assertEquals("Luda Tverday", "Luda ".concat("Tverday"));
		assertEquals("Tel-Aviv", "Tel".concat("-").concat("Aviv"));
		assertEquals("058-2223618", "".concat("058").concat("-").concat("2223618").concat(""));
	}

	@Test
	@Disabled
	void testConcatException() {
		assertEquals("Tel-Aviv", "Tel".concat(null).concat("Aviv"));
	}

	@Test
	void testStartsWith() {
		assertTrue("Telran is a better company!".startsWith("Telran"));
		assertFalse("Telran is a better company!".startsWith("telran"));
		assertTrue("Telran is a better company!".startsWith("is", 7));
		assertFalse("Telran is a better company!".startsWith("is"));
		assertFalse("Telran is a better company!".startsWith(" "));
		assertTrue("Telran is a better company!".startsWith(""));
	}

	@Test
	void testEndsWith() {
		assertTrue("Don`t give up!".endsWith("up!"));
		assertFalse("Don`t give up! ".endsWith("up!"));
		assertTrue("Don`t give up!".endsWith(""));

	}

	@Test
	void testContains() {
		assertTrue("It`s time to wake up.".contains("time"));
		assertFalse("It`s time to wake up.".contains("team"));
		assertFalse("It`s time to wake up.".contains("  "));
		assertTrue("It`s time to wake up.".contains("s"));
		assertTrue("".contains(""));

	}

	@Test
	@Disabled
	void testContainsException() {
		assertTrue("It`s time to wake up.".contains(null));
	}

	@Test
	void testIndexOfString() {
		assertEquals(5, "indexOf method".indexOf("Of"));
		assertEquals(-1, "indexOf method".indexOf("of"));
		assertEquals(-1, "indexOf method".indexOf(0));
		assertTrue("indexOf method".indexOf(6) == -1);
		assertEquals(8, "indexOf method".indexOf("method", 7));
	}

	@Test
	@Disabled
	void testIndexOfStringException() {
		assertEquals(-1, "indxOf method".indexOf(null));
	}

	@Test
	void testLastIndexOf() {
		assertEquals(14, "user1234@gmail.com".lastIndexOf(".com"));
		assertEquals(-1, "lastIndexOf".lastIndexOf(0));
		assertEquals(-1, "lastIndexOf00".lastIndexOf('0', 5));
		assertEquals(1, "lastIndexOf example".lastIndexOf("as", 11));

	}

	@Test
	@Disabled
	void testLastIndexOfStringException() {
		assertEquals(0, "lastIndexOf".lastIndexOf(null));
	}
}
