package testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AllTests {
	

	@Test
	void test() {
		assertEquals(3, Tester.add(1,2));
		assertEquals(8, Tester.add(4,4));
	}

}
