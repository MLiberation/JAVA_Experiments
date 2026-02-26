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

		// Object[] studioObjects = new Object[5];

		/* studioObjects[0] = new Vocalist("Erdem");
		studioObjects[1] = new CoffeeMachine();
		studioObjects[2] = new Guitar("Erdem","A",false);
		studioObjects[3] = new Piano("Ömer","B",128 );
		studioObjects[4] = new ElectronicDrum("Ahmet","C"); */

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

		/*for(int i = 0; i < studioObjects.size(); i++)
		{
			if(studioObjects[i] instanceof Instrument)
			{
				try
				{
					((Instrument)studioObjects[i]).play();
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
			else if(studioObjects[i] instanceof CoffeeMachine)
			{
				((CoffeeMachine)studioObjects[i]).makeCoffee();
				System.out.println();
			}
			else if(studioObjects[i] instanceof Vocalist)
			{
				System.out.println("The Vocalsit is singing...");
				((Vocalist)studioObjects[i]).sing();
				System.out.println();
			}

			if(studioObjects[i] instanceof Recordable)
			{
				((Recordable)studioObjects[i]).recordSession(songName);
				System.out.println("////////////////////");
			}
			else
			{
				System.out.println("Skipping: " + studioObjects[i]);
				System.out.println("////////////////////");
			}
		}*/

		//canRecordable(ownedInstruments,songName);
	}

	/*public static void canRecordable(Instrument[] instruments, String command)
	{
		for(int i = 0; i < instruments.length; i++)
		{
			if(instruments[i] instanceof Recordable)
			{
				((Recordable)instruments[i]).recordSession(command);
			}
			else
			{
				System.out.println("Skipping this object:");
				System.out.println(instruments[i]);
			}
		}
	}*/

	public static void main(String[] args)
	{
		studioOperations();
	}
}
