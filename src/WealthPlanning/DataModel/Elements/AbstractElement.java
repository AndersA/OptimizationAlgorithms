package WealthPlanning.DataModel.Elements;

// Base Element for all Elements
public abstract class AbstractElement {
	public static enum BaseType {Asset, Liablitiy, Insurace, Company, Invalid}
	protected String m_Description;
	
	public abstract BaseType GetBaseType();
	public String GetDescription() {return m_Description;}
}
