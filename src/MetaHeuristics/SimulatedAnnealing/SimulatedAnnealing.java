package MetaHeuristics.SimulatedAnnealing;

public class SimulatedAnnealing {
	
	public static void Run(ISimulatedAnnealing iSA)
	{
		double temperatur = iSA.GetStartTemperature();
		while(!iSA.Stop())
		{
			temperatur = iSA.Anneal(temperatur);
			double current = iSA.GetCurrent();
			double neighbor = iSA.GetNeighbor();
			// If our probability function returns a 
			if(iSA.GetProbability(current, neighbor, temperatur) >= Math.random())
				iSA.UpdateCurrent();
		}
	}
}
