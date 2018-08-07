import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class B06_2577Test {

	@Test
	void test() {
		B06_2577 B06_2577Test = new B06_2577();
		int a = 150*266*427;

		assertEquals("Multiple Result",17037300,a);
		assertEquals("0",3,B06_2577.HowMuchNum(a)[0]);
		assertEquals("1",1,B06_2577.HowMuchNum(a)[1]);
		assertEquals("2",0,B06_2577.HowMuchNum(a)[2]);
		assertEquals("3",2,B06_2577.HowMuchNum(a)[3]);
		assertEquals("4",0,B06_2577.HowMuchNum(a)[4]);
		assertEquals("5",0,B06_2577.HowMuchNum(a)[5]);
		assertEquals("6",0,B06_2577.HowMuchNum(a)[6]);
		assertEquals("7",2,B06_2577.HowMuchNum(a)[7]);
		assertEquals("8",0,B06_2577.HowMuchNum(a)[8]);
		assertEquals("9",0,B06_2577.HowMuchNum(a)[9]);
		}
}
