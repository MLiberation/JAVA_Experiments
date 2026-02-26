public abstract class Instrument
{
	private String ownerName;
	private String brand;

	public Instrument(String ownerName, String brand)
	{
		this.ownerName = ownerName;
		this.brand = brand;
	}

	public abstract void play() throws BrokenInstrumentException;

	public void tune()
	{
		System.out.println("Instrument is being tuned.");
	}

	@Override
	public String toString()
	{
		return ownerName + " " + brand; 
	}
}
