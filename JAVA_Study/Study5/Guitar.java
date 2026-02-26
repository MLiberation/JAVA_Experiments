import java.util.Random;

public class Guitar extends Instrument
{
	Random random = new Random();

	private boolean hasDistortion;

	public Guitar(String ownerName, String brand, boolean hasDistortion)	
	{
		super(ownerName, brand);
		this.hasDistortion = hasDistortion;
	}

	@Override
	public void play() throws BrokenInstrumentException
	{
		int possiblity = random.nextInt(1,11);
		if(possiblity  == 10)
		{
			throw new BrokenInstrumentException("Guitar string snapped! Twannng!");
		}
		else
		{
			if(hasDistortion == true)
			{
				System.out.println("Playing rock music!");
			}
			else
			{
				System.out.println("Playing acoustic songs...");
			}
		}
	}
}
