import static org.junit.Assert.*;

import org.junit.Test;

import Gdemo.demo.Multiplication;

public class TestMultiplication {

	@Test
	public  void testMulti() {
		Multiplication test = new Multiplication();
		int result = test.multi(3, 4);
		assertEquals(12, result);
	}

}
