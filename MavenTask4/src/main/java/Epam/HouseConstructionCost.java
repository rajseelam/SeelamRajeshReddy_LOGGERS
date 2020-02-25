package Epam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HouseConstructionCost {
	private static final Logger LOGGER =LogManager.getLogger(HouseConstructionCost.class);
		public double FullyAutomatedHomeCost(String MaterialStandard,double AreaOfHouseInFeets)
	{
			
			LOGGER.error("The error LOGGER");
			LOGGER.fatal("The fatal LOGGER");

		double cost=0;
		if(MaterialStandard.equals("StandardMaterials"))
	   {
		cost=1200*(AreaOfHouseInFeets);
	   }
		else if(MaterialStandard.equals("AboveStandardMaterials"))
		{
		cost =1500*(AreaOfHouseInFeets);	
		}
		else if(MaterialStandard.equals("HighStandardMaterial"))
		{
		cost=1800*(AreaOfHouseInFeets);	
		}
		else if(MaterialStandard.equals("HighStandardMaterialAndFullyAutomatedHome"))
		{
		cost=2500*(AreaOfHouseInFeets);	
		}
		
			
		return cost;
	}

}
