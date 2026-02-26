public class CategoricalSeries extends Series 
{
	public CategoricalSeries(String name, int count,String type)
	{
		super(name,count,type);
	}

	@Override
	public void plot()
	{
		System.out.println("Plotting this Categorical Series..");
	}

	@Override
	public void export()
	{
		System.out.println("Exporting this Categorical Series..");
	}
}
