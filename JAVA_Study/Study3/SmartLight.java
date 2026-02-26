public class SmartLight extends SmartDevice implements VoiceControllable
{
	private int brightness;

	public SmartLight(int deviceID, String deviceName, String location, int brightness)
	{
		super(deviceID, deviceName, location);
		this.brightness = brightness;
	}

	@Override
	public void operate()
	{
		if(super.getIsOn() == true)
		{
			System.out.println("Emitting light at level " + brightness);
		}
		else
		{
			System.out.println("Smart light is not on.");
		}
	}

	@Override
	public void getStatus()
	{
		if(super.getIsOn() == true)
		{
			System.out.println("Smart light is on. Current brightness: " + brightness);
		}
		else
		{
			System.out.println("Smart light is not on.");
		}
	}

	@Override
	public void processVoiceCommand(String command)
	{
		if(command.contains("increase"))
		{
			brightness = brightness + 5;
			System.out.println("SmartLight brightness is increased.");
		}
		if(command.contains("decrease"))
		{
			brightness = brightness - 5;
			System.out.println("SmartLight brightness is decreased");
		}
	}
}
