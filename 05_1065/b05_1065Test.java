import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class b05_1065Test {

	@Test
	void test() {
		b05_1065 b05_1065Test = new b05_1065();
		assertEquals(99, b05_1065Test.hanNum(99));
		assertEquals(99, b05_1065Test.hanNum(110));
		assertEquals(100, b05_1065Test.hanNum(111));
		assertEquals(101, b05_1065Test.hanNum(123));
		assertEquals(144, b05_1065Test.hanNum(1000));
	}

}
