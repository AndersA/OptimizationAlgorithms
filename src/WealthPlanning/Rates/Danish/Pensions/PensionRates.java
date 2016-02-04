package WealthPlanning.Rates.Danish.Pensions;
import WealthPlanning.Rates.*;
import WealthPlanning.DataModel.Elements.Assets.Pensions.Pension.PensionType;

public class PensionRates 
{	
	private static Rate m_Annuity;
	private static Rate m_LifeAnnuity;
	private static Rate m_LumpSum;
	
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
		case Life:
		case Undefined:
		case Invalid:
			return -1.0;
		}
		
		return -1.0;
	}
	
	// Get annuity rates
	private static double GetAnnuityRate(int year)
	{
		// Lazy initialize rates
		if (m_Annuity == null)
			m_Annuity = PensionRateInitializers.InitializeAnnuityRates();
		
		return m_Annuity.GetRate(year);
	}
	
	// Get life annuity rates
	private static double GetLifeAnnuityRate(int year)
	{
		// Lazy initialize rates
		if(m_LifeAnnuity == null)
			m_LifeAnnuity = PensionRateInitializers.InitializeLifeAnnuityRates();
		
		return m_LifeAnnuity.GetRate(year);
	}
	
	// Get lump sum rates
	private static double GetLumpSumRate(int year)
	{
		// Lazy initialize rates
		if(m_LumpSum == null)
			m_LumpSum = PensionRateInitializers.InitializeLumpSumRates();
		
		return m_LumpSum.GetRate(year);
	}
}
