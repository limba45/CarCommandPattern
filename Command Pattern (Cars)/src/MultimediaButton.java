
public class MultimediaButton {
	
	Command_Car button;
	public void setControlCommand(Command_Car command)
	{
		button =  command;
	}
	
	public void buttonPressed()
	{
		button.executeCommand();
	}

}
