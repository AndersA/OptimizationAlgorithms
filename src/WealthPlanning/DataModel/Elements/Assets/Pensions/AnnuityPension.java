package WealthPlanning.DataModel.Elements.Assets.Pensions;

public class AnnuityPension extends Pension {
	
	@Override
	public PensionType GetPensionType() {return PensionType.Annuity;}
	
	@Override
	public double GetPayment(int year)
	{
		return 0.0;
	}
}
