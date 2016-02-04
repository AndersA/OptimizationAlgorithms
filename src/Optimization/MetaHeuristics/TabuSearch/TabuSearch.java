package Optimization.MetaHeuristics.TabuSearch;

public class TabuSearch {
	public static void Run(ITabuSearch iTS)
	{
		while(!iTS.Stop())
		{
			double current = iTS.GetCurrent();
			double neighbor = iTS.GetNeighbor();
			// Pick if the new neighbor is better than the current, else make tabu
			if(neighbor > current)
				iTS.UpdateCurrent();
			else
				iTS.MakeTabu();
		}
	}
}
