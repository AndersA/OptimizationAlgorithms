package WealthPlanning.DataModel.Elements.Assets.Pensions;

public class LumpSumPension extends Pension {
	
	@Override
	public PensionType GetPensionType() {return PensionType.LumpSum;}
	
	@Override
	public double GetPayment(int year)
	{
		return 0.0;
	}
}
