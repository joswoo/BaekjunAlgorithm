import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class B07_11654Test {

	
	@Test
	void test() {
		B07_11654 B07_11654Test = new B07_11654();
		String A = "A";
		String C = "C";
		String zero = "0";
		String nine = "9";
		String a = "a";
		String z = "z";
		assertSame(65, B07_11654Test.ascii(A));
		assertSame(67, B07_11654Test.ascii(C));
		assertSame(48, B07_11654Test.ascii(zero));
		assertSame(57, B07_11654Test.ascii(nine));
		assertSame(97, B07_11654Test.ascii(a));
		assertSame(122, B07_11654Test.ascii(z));
		
	}

}
