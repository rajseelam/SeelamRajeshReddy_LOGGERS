package Epam;

import java.lang.Math;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class CalculateInterest {
	
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");

	
	public double CalculateSimpleInterest(double RateofInterest,double PrincipleAmount,double Time)
	{
		
	
		double SimpleInterest=((RateofInterest)*(PrincipleAmount)*(Time))/100;
	return SimpleInterest;	
	}
	public double CalculateCompoundInterest(double RateofInterest,double PrincipleAmount,double Time,String TypeofCompoundInterest)
	{
		double Amount=0;
		if(TypeofCompoundInterest.equals("Annually"))
		{
			
			Amount=PrincipleAmount*Math.pow(1+((RateofInterest)/100),Time);
		}
		else if(TypeofCompoundInterest.equals("Half-Yearly"))
		{
			Amount=PrincipleAmount*Math.pow(1+((RateofInterest)/200),2*Time);
		}
		else if(TypeofCompoundInterest.equals("Quarterly"))
		{
			Amount=PrincipleAmount*Math.pow(1+((RateofInterest)/400),4*Time);
		}
		else if(TypeofCompoundInterest.equals("Monthly"))
		{
			Amount=PrincipleAmount*Math.pow(1+((RateofInterest)/1200),12*Time);
		}
		double CompoundInterest=Amount-PrincipleAmount;
		double CompoundInterest1=Double.parseDouble(df2.format(CompoundInterest));
		
	
		return CompoundInterest1;
	}

}
