package Epam;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHouseConstructionCost {

	@Test
	public void test() {
		HouseConstructionCost H=new HouseConstructionCost();
		double Expected=500000.0;
		assertEquals(Expected,H.FullyAutomatedHomeCost("HighStandardMaterialAndFullyAutomatedHome", 200),0);
	}

}
