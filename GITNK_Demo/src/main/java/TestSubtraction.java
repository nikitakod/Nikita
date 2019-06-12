import static org.junit.Assert.*;

import org.junit.Test;

import Gdemo.demo.Substraction;

public class TestSubtraction {

	@Test
	public final void test() {
		Substraction test = new Substraction();
		int result = test.sub(5, 4);
		assertEquals(1, result);
	}

}
