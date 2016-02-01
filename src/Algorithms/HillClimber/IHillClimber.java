package Algorithms.HillClimber;

// Interface for a hill climber implementation.
public interface IHillClimber {
	public double GetBest();
	public double GetNeighbor();
	public boolean Stop();
	public void UpdateBest();
}
