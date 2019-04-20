package callInterest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InterestTest {

	@Test
	void testCalSimpleInterest() {
		CallInterest obj=new CallInterest();
		assertEquals(1515.1500244140625,obj.callSimpleInterest(20202, 2.5f,3));
	}

	@Test
	void testCalCompoundInterest() {
		CallInterest obj=new CallInterest();
		assertEquals(21755.342888139312,obj.callCompoundInterest(20202, 2.5f,3));
	}

}
