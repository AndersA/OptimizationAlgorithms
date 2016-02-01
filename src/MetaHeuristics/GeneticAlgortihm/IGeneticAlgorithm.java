package MetaHeuristics.GeneticAlgortihm;

public interface IGeneticAlgorithm {
	public void CreateInitialPopulation();
	public void EvaluatePopulation();
	public boolean FormChildren();
	public void FormChild();
	public void UpdatePopulation();
	public boolean Stop();
}
