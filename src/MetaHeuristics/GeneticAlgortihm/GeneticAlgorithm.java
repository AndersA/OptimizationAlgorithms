package MetaHeuristics.GeneticAlgortihm;

public class GeneticAlgorithm {
	
	public static void Run(IGeneticAlgorithm iGA)
	{
		// Create initial population.
		iGA.CreateInitialPopulation();
		while(!iGA.Stop())
		{
			// Evaluate fitness level of population
			iGA.EvaluatePopulation();
			// While we need to form children (by crossover rate), form children.
			while(iGA.FormChildren())
			{
				iGA.FormChild();
			}
			// When all children has been formed, kill least fit individuals
			iGA.UpdatePopulation();
		}
	}
}
