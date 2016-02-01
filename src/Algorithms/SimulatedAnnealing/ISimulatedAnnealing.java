package Algorithms.SimulatedAnnealing;

public interface ISimulatedAnnealing {
	// Get a new neighbor
	public double GetNeighbor();
	// Get current solution
	public double GetCurrent();
	// Get best solution found so far
	public double GetBest();
	// Get probability for picking neighbor, (current, neighbor, temperature)
	public double GetProbability(double e, double eNew, double temperature);
	// Get start temperature
	public double GetStartTemperature();
	// Anneal temperature function
	public double Anneal(double temperature);
	// Update current solution with neighbor
	public void UpdateCurrent();
	// Return stopping criteria
	public boolean Stop();
}
