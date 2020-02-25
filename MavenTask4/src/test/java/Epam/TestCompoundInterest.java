package Epam;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCompoundInterest {

	@Test
	public void test() {
		CalculateInterest c=new CalculateInterest();
		double Expected=307.5;
		assertEquals(Expected,c.CalculateCompoundInterest(5,3000,2,"Annually"),0);
	}

	

}
