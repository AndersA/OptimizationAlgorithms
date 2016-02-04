package WealthPlanning.Rates;
import java.util.*;

// Class for holding rates
public class Rate {
	// Using navigable map to look up use intervals for rates (e.g. 2014-2017, 0.2%).
	// So ex. you add map.put(2014, 0.2%); map.put(2018,0.3%).
	private NavigableMap<Integer, Double> m_RateMap;
	
	public Rate(NavigableMap<Integer, Double> rateMap) 
	{ 
		// Initialize tree map
		this.m_RateMap = rateMap;
	}
	
	public double GetRate(int year)
	{
		Map.Entry<Integer, Double> entry = m_RateMap.floorEntry(year);
		if(entry == null)
			return -1.0;
		
		return entry.getValue();
	}
}
