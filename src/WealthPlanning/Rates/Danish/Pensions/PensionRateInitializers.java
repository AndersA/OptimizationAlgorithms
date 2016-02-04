package WealthPlanning.Rates.Danish.Pensions;
import java.util.*;
import WealthPlanning.Rates.Rate;

// Initialization of different pension rates (This could be done more smooth with a document or whatevah).
public class PensionRateInitializers {
	public static Rate InitializeAnnuityRates()
	{
		NavigableMap<Integer, Double> rateMap = new TreeMap<Integer, Double>();
		rateMap.put(2014, 50000.0);
		rateMap.put(2016, 51000.0);
		
		return new Rate(rateMap);
	}
	
	public static Rate InitializeLifeAnnuityRates()
	{
		NavigableMap<Integer, Double> rateMap = new TreeMap<Integer, Double>();
		rateMap.put(2014, 50000.0);
		
		return new Rate(rateMap);
	}
	
	public static Rate InitializeLumpSumRates()
	{
		NavigableMap<Integer, Double> rateMap = new TreeMap<Integer, Double>();
		rateMap.put(2014, 20000.0);
		
		return new Rate(rateMap);
	}
}
