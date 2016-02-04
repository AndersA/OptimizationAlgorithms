package Optimization.MetaHeuristics.TabuSearch;

public interface ITabuSearch {
	// Get current solution value
	public double GetCurrent();
	// Get new neighbor
	public double GetNeighbor();
	// Stopping criteria
	public boolean Stop();
	// Update current solution
	public void UpdateCurrent();
	// Make current solution tabu
	public void MakeTabu();
}
