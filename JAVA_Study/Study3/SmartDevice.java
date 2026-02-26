public abstract class SmartDevice
{
	private int deviceID;
	private String deviceName;
	private String location;
	private boolean isOn;
	private static int deviceCount;

	public SmartDevice(int deviceID, String deviceName, String location)
	{
		this.deviceID = deviceID;
		this.deviceName = deviceName;
		this.location = location;
		isOn = false;
		deviceCount++;
	}

	public static int getDeviceCount()
	{
		return deviceCount;
	}

	public void turnOn()
	{
		isOn = true;
		System.out.println(this.deviceName + " değeri " + isOn);
	}

	public abstract void operate();
	public abstract void getStatus();

	public int getDeviceID()
	{
		return deviceID;
	}

		public String getDeviceName()
	{
		return deviceName;
	}

		public String getLocation()
	{
		return location;
	}

	public boolean getIsOn()
	{
		return isOn;
	}

	@Override
	public String toString()
	{
		return deviceID + " " + deviceName + " " + isOn + " " + location;
	}


}
