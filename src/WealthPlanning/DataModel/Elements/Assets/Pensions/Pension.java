package WealthPlanning.DataModel.Elements.Assets.Pensions;
import WealthPlanning.DataModel.Elements.Assets.Asset;

// Abstract class for pensions
public abstract class Pension extends Asset {
	// Enum for pension types
	public static enum PensionType {Annuity, LumpSum, Life, LifeAnnuity, Undefined, Invalid};
	
	// Override GetAssetType
	@Override
	public AssetType GetAssetType() { return AssetType.Pension;};
	public abstract PensionType GetPensionType();
	public abstract double GetPayment(int year);
}
