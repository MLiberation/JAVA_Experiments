import java.util.ArrayList;

public class Studio
{
	public static void studioOperations()
	{
		ArrayList<Object> studioObjects = new ArrayList<>();

		studioObjects.add(new Vocalist("Erdem"));
		studioObjects.add(new CoffeeMachine());
		studioObjects.add(new Guitar("Erdem","A",false));
		studioObjects.add(new Piano("Ömer","B",128 ));
		studioObjects.add(new ElectronicDrum("Ahmet","C"));

		String songName = "Yeraltı";

		for(Object obj : studioObjects)
		{
			if(obj instanceof Instrument)
			{
				try
				{
					((Instrument)obj).play();
					System.out.println();
				}
				catch(BrokenInstrumentException e)
				{
					System.out.println("CRITICAL FAILURE");
					System.out.println(e.getMessage());
				}
				finally
				{
					System.out.println("Cleaning up the stage...");
				}
			}
			else if(obj instanceof CoffeeMachine)
			{
				((CoffeeMachine)obj).makeCoffee();
				System.out.println();
			}
			else if(obj instanceof Vocalist)
			{
				System.out.println("The Vocalsit is singing...");
				((Vocalist)obj).sing();
				System.out.println();
			}

			if(obj instanceof Recordable)
			{
				((Recordable)obj).recordSession(songName);
				System.out.println("////////////////////");
			}
			else
			{
				System.out.println("Skipping: " + obj);
				System.out.println("////////////////////");
			}
		}
	}

	public static void main(String[] args)
	{
		studioOperations();
	}
}
