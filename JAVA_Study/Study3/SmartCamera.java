public class SmartCamera extends SmartDevice
{
	private String resolution;
	private double storageInfo;

	public SmartCamera(int deviceID, String deviceName, String location, String resolution, double storageInfo)
	{
		super(deviceID, deviceName, location);
		this.resolution = resolution;
		this.storageInfo = storageInfo;
	}

	@Override
	public void operate()
	{
		if(super.getIsOn() == true)
		{
			System.out.println("Recording at " + resolution + "resolution.");
		}
		else
		{
			System.out.println("Smart camera is not on.");
		}
	}

	@Override
	public void getStatus()
	{
		if(super.getIsOn() == true)
		{
			System.out.println("Recording at " + resolution + "resolution. Available space: " + storageInfo + "GB");
		}
		else
		{
			System.out.println("Smart camera is not on.");
		}
	}
}
