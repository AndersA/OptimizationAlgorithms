package WealthPlanning.DataModel.Elements.Assets.Pensions;

public class LifeAnnuityPension extends Pension {
	
	@Override
	public PensionType GetPensionType() {return PensionType.LifeAnnuity;}
	
	@Override
	public double GetPayment(int year)
	{
		return 0.0;
	}
}
