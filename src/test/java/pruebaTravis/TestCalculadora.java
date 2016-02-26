package pruebaTravis;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadora {

	@Test
	public void testMultiplica() {
		Calculadora calc = new Calculadora();
		int a=2, b=3;
		int expected = a*b;
		int actual = calc.multiplica(a, b);
		assertEquals(expected, actual);
		//assertTrue(2*3 == calc.multiplica(2, 3));
	}

}
