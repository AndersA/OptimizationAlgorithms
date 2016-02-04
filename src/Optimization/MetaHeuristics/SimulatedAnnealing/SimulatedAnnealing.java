package Optimization.MetaHeuristics.SimulatedAnnealing;

public class SimulatedAnnealing {
	
	public static void Run(ISimulatedAnnealing iSA)
	{
		double temperatur = iSA.GetStartTemperature();
		while(!iSA.Stop())
		{
			temperatur = iSA.Anneal(temperatur);
			double current = iSA.GetCurrent();
			double neighbor = iSA.GetNeighbor();
			// If probability is accepted, update current solution
			if(iSA.GetProbability(current, neighbor, temperatur) >= Math.random())
				iSA.UpdateCurrent();
		}
	}
}
