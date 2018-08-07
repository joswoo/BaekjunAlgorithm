import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class B06_10039Test {

	@Test
	void test() {
		B06_10039 B06_10039Test = new B06_10039();
		assertEquals(40, B06_10039Test.reScore(10));
		assertEquals(65, B06_10039Test.reScore(65));
		assertEquals(100, B06_10039Test.reScore(100));
		assertEquals(40, B06_10039Test.reScore(30));
		assertEquals(95, B06_10039Test.reScore(95));
		
	}

}
