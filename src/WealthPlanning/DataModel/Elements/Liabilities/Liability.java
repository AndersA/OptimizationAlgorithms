package WealthPlanning.DataModel.Elements.Liabilities;
import WealthPlanning.DataModel.Elements.AbstractElement;

public abstract class Liability extends AbstractElement {
	@Override
	public BaseType GetBaseType() { return BaseType.Liablitiy; }
}
