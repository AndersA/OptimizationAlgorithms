package WealthPlanning.Rates.Danish.Pensions;
import WealthPlanning.Rates.*;
import WealthPlanning.DataModel.Elements.Assets.Pensions.Pension.PensionType;

public class PensionRates 
{	
	private static Rate m_Annuity;
	private static Rate m_LifeAnnuity;
	private static Rate m_LumpSump;
	
	// Public getter for a given year for a given pension type.
	public static double GetRate(int year, PensionType type)
	{
		switch(type)
		{
		case Annuity:
			return GetAnnuityRate(year);
		case LifeAnnuity:
			return GetLifeAnnuityRate(year);
		case LumpSum:
			return GetLumpSumRate(year);
		}
		
		return -1.0;
	}
	
	private static double GetAnnuityRate(int year)
	{
		// Lazy initialize rate
		if (m_Annuity == null)
			InitializeAnnuityRates();
		
		return m_Annuity.GetRate(year);
	}
}
