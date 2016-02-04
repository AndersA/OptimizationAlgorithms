package WealthPlanning.DataModel.Elements.Assets;
import WealthPlanning.DataModel.Elements.AbstractElement;

public abstract class Asset extends AbstractElement {
	public static enum AssetType {Salary, Pension, Stock, Bond, TaxFree, Undefined, Invalid}; 
	
	@Override
	public BaseType GetBaseType() {return BaseType.Asset;}
	public AssetType GetAssetType() { return AssetType.Undefined; }
}
