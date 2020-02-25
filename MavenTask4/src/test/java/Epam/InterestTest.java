package Epam;

import static org.junit.Assert.*;

import org.junit.Test;

public class InterestTest {

	
	@Test
	public void test() {
		CalculateInterest c=new CalculateInterest();
		assertEquals(300.00,c.CalculateSimpleInterest(5.00,3000.00,2.00),0);
		
	}

	

	

}
