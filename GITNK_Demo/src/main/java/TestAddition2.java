import static org.junit.Assert.*;

import org.junit.Test;

import Gdemo.demo.Addition;

public class TestAddition2 {

	@Test
	public  void testAdd() {
		Addition test = new Addition();
		int result = test.add(3, 4);
		assertEquals(7, result);
	}

}
