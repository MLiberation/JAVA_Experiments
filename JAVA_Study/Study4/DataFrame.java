import java.util.Arrays;
 
public class DataFrame extends DataStructure implements Exportable
{
	String[] columnNames = {"Product","Price","Quantity"} ;

	public DataFrame(String name, int count, String[] columnNames)
	{
		super(name,count);
		this.columnNames = columnNames;
	}

	@Override
	public void plot()
	{
		System.out.println("Plotting this Data Frame..");
	}

	@Override
	public void export()
	{
		System.out.println("Exporting this Data Frame..");
	}

	@Override
	public String toString()
	{
		return "Data Frame object: Name: " + super.getName() + ", Row Count " + super.getCount() + ", Columns " + Arrays.toString(columnNames);
	}
}
