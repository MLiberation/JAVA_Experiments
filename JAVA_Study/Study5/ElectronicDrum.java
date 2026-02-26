public class ElectronicDrum extends Instrument implements Recordable
{
	public ElectronicDrum(String ownerName, String brand)
	{
		super(ownerName, brand);
	}

	@Override
	public void play()
	{
		System.out.println("Playing beats!");
	}

	@Override
	public void recordSession(String command)
	{
		System.out.println("Recording drum track for " + command + "...");
	}
}
