public class Vocalist implements Recordable
{
	private String name;

	public Vocalist(String name)
	{
		this.name = name;
	}

	public void sing()
	{
		System.out.println("Lalala...");
	}

	@Override
	public void recordSession(String command)
	{
		System.out.println("Recording vocals of " + name + "...");
	}
}
