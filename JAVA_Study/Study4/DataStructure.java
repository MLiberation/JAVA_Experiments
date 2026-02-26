public abstract class DataStructure implements Plottable 
{
	private String name;
	private int count;

	public DataStructure(String name, int count)
	{
		this.name = name;
		this.count = count;
	}

	public String getName()
	{
		return name;
	}

	public int getCount()
	{
		return count;
	}
}
