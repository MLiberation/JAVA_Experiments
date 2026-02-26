public class NumericalSeries extends Series  
{
	public NumericalSeries(String name, int count,String type)
	{
		super(name,count,type);
	}

	@Override
	public void plot()
	{
		System.out.println("Plotting this Numerical Series..");
	}

	@Override
	public void export()
	{
		System.out.println("Exporting this Numerical Series..");
	}
}
