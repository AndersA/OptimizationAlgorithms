package WealthPlanning.Rates.Danish.Pensions;
import WealthPlanning.Rates.*;

public class PensionRates 
{	
	private static Rate m_Annuity;
	private static Rate m_LifeAnnuity;
	private static Rate m_LumpSum;
	
	// Get annuity rates
	public static double GetAnnuityRate(int year)
	{
		// Lazy initialize rates
		if (m_Annuity == null)
			m_Annuity = PensionRateInitializers.InitializeAnnuityRates();
		
		return m_Annuity.GetRate(year);
	}
	
	// Get life annuity rates
	public static double GetLifeAnnuityRate(int year)
	{
		// Lazy initialize rates
		if(m_LifeAnnuity == null)
			m_LifeAnnuity = PensionRateInitializers.InitializeLifeAnnuityRates();
		
		return m_LifeAnnuity.GetRate(year);
	}
	
	// Get lump sum rates
	public static double GetLumpSumRate(int year)
	{
		// Lazy initialize rates
		if(m_LumpSum == null)
			m_LumpSum = PensionRateInitializers.InitializeLumpSumRates();
		
		return m_LumpSum.GetRate(year);
	}
}
