import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class B07_11654Test {

	
	@Test
	void test() {
		B07_11654 B07_11654Test = new B07_11654();
		assertEquals(65,B07_11654Test.ascii("A"));
		assertEquals(67,B07_11654Test.ascii("C"));
		assertEquals(48,B07_11654Test.ascii("0"));
		assertEquals(57,B07_11654Test.ascii("9"));
		assertEquals(97,B07_11654Test.ascii("a"));
		assertEquals(122,B07_11654Test.ascii("z"));
		
		
	}

}
