package Optimization.MetaHeuristics.HillClimber;

// Interface for a hill climber implementation.
public interface IHillClimber {
	// Get best solution found so far-
	public double GetBest();
	// Get new neighbor solution
	public double GetNeighbor();
	// Stopping criteria.
	public boolean Stop();
	// Update best solution.
	public void UpdateBest();
}
