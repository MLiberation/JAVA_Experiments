public class Piano extends Instrument
{
	private int numberOfKeys;

	public Piano(String ownerName, String brand,int numberOfKeys)
	{
		super(ownerName, brand);
		this.numberOfKeys = numberOfKeys;
	}

	@Override
	public void play()
	{
		System.out.println("Playing a melody with " + this.numberOfKeys + " keys.");
	}
}
