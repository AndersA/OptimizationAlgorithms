package WealthPlanning.Rates;
import java.util.*;

// Class for holding rates
public class Rate {
	// Using navigable map to look up use intervals for rates (e.g. 2014-2017, 0.2%).
	private NavigableMap<Integer, Double> m_RateMap;
	
	public Rate(NavigableMap<Integer, Double> rateMap) 
	{ 
		// Check if the given map is null, otherwise initialize
		if(rateMap == null)
			m_RateMap = new TreeMap<Integer,Double>();
		else
			m_RateMap = rateMap;
	}
	
	public double GetRate(int year)
	{
		Map.Entry<Integer, Double> entry = m_RateMap.floorEntry(year);
		if(entry == null)
			return -1.0;
		
		return entry.getValue();
	}
}
