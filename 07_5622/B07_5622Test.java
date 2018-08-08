import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class B07_5622Test {

	@Test
	void test() {
		B07_5622 Tester = new B07_5622();
		assertEquals(3,Tester.dial("A"));
		assertEquals(3,Tester.dial("B"));
		assertEquals(3,Tester.dial("C"));
		
		assertEquals(4,Tester.dial("D"));
		assertEquals(4,Tester.dial("E"));
		assertEquals(4,Tester.dial("F"));
		
		assertEquals(5,Tester.dial("G"));
		assertEquals(5,Tester.dial("H"));
		assertEquals(5,Tester.dial("I"));
		
		assertEquals(6,Tester.dial("J"));
		assertEquals(6,Tester.dial("K"));
		assertEquals(6,Tester.dial("L"));
		
		assertEquals(7,Tester.dial("M"));
		assertEquals(7,Tester.dial("N"));
		assertEquals(7,Tester.dial("O"));
		
		assertEquals(8,Tester.dial("P"));
		assertEquals(8,Tester.dial("Q"));
		assertEquals(8,Tester.dial("R"));
		assertEquals(8,Tester.dial("S"));
		
		assertEquals(9,Tester.dial("T"));
		assertEquals(9,Tester.dial("U"));
		assertEquals(9,Tester.dial("V"));
		
		assertEquals(10,Tester.dial("W"));
		assertEquals(10,Tester.dial("X"));
		assertEquals(10,Tester.dial("Y"));
		assertEquals(10,Tester.dial("Z"));
		
	}

}
