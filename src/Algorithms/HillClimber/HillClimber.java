package Algorithms.HillClimber;

public class HillClimber {
	// Static method for running a hill climber with an hill climber interface.
	public static void Run(IHillClimber iHC)
	{
		while(!iHC.Stop())
		{
			double best = iHC.GetBest();
			double neighbor = iHC.GetNeighbor();			
			if(neighbor > best)
				iHC.UpdateBest();
		}
	}
}
