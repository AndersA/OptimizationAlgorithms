package MetaHeuristics.GeneticAlgortihm;

public interface IGeneticAlgorithm {
	// Generate initial population.
	public void CreateInitialPopulation();
	// Evaluate fitness level of population.
	public void EvaluatePopulation();
	// Returns true if a new child needs to be formed.
	public boolean FormChildren();
	// Form a new child from population
	public void FormChild();
	// Update current population with new children and kill least fit individuals
	public void UpdatePopulation();
	// Stopping criteria.
	public boolean Stop();
}
