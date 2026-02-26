public class Home {

    public static void homeOperations() 
	{
        SmartDevice[] homeDevices = new SmartDevice[3];

        homeDevices[0] = new SmartLight(0, "Living Room Light", "Living Room", 75);
        homeDevices[1] = new SmartLight(1, "Kitchen Light", "Kitchen", 40);
        homeDevices[2] = new SmartCamera(2, "Baby Camera", "Nursery", "1080p", 33.8);


        //DON'T CHANGE THE CODE ABOVE.


        //Print the number of devices.
		System.out.print("Number of devices: ");
		System.out.println(SmartDevice.getDeviceCount());

        //Opening all SmartDevices
		homeDevices[0].turnOn();
		homeDevices[1].turnOn();
		homeDevices[2].turnOn();

        //Operating all SmartDevices
		homeDevices[0].operate();
		homeDevices[1].operate();
		homeDevices[2].operate();
		homeDevices[0].getStatus();
		homeDevices[1].getStatus();
		homeDevices[2].getStatus();
		System.out.println();

        //Voice command
        String voiceCommand = "Hey, please increase the brightness, I cannot see anything in this room! ";

        //Sending voice command to all devices.
		sendVoiceCommandToAll(homeDevices,voiceCommand);
    }

    public static void sendVoiceCommandToAll(SmartDevice[] devices, String command)
	{
		System.out.println("Sending voice command to devices: " + command);
		for(int i = 0; i < devices.length; i++)
		{
			if(devices[i] instanceof VoiceControllable)
			{
				((VoiceControllable)devices[i]).processVoiceCommand(command);
			}
			else
			{
				System.out.println("Skipping this object:");
				System.out.println(devices[i]);				
			}
		}
    }


    public static void main(String[] args) 
	{
        homeOperations();
    }
}
