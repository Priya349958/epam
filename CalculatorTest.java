import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class CalculatorTest {
	@Test
	void testAdd() {
		Arithmetic obj=new Arithmetic();
		assertEquals(10.0,obj.Add(2.0, 8.0));
	}

	@Test
	void testMul() {
		Arithmetic obj=new Arithmetic();
		assertEquals(20.0,obj.Mul(4.0, 5.0));
		
	}

	@Test
	void testDiv() {
		Arithmetic obj=new Arithmetic();
		assertEquals(2.0,obj.Div(4.0, 2.0));
		
	}

}
