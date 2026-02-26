public abstract class Series extends DataStructure implements Exportable
{
	String type;

	public Series(String name, int count,String type)
	{
		super(name, count);
		this.type = type;
	}

	@Override
	public String toString()
	{
		return "Series Object: Name: " + super.getName() + ", Row Count: " + super.getCount() + ", Data Type: " + type;
	} 
}
