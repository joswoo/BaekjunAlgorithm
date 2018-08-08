import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class B07_1316Test {

	@Test
	void test() {
		B07_1316 Tester = new B07_1316();
		
		assertEquals(1,Tester.checkAlphabat("happy"));
		assertEquals(1,Tester.checkAlphabat("new"));
		assertEquals(1,Tester.checkAlphabat("year"));
		
		assertEquals(0,Tester.checkAlphabat("aba"));
		assertEquals(0,Tester.checkAlphabat("abab"));
		assertEquals(0,Tester.checkAlphabat("abcabc"));
		assertEquals(1,Tester.checkAlphabat("a"));
	}

}
