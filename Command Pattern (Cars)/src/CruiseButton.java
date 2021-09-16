
public class CruiseButton {
	
	Command_Car button;
	public CruiseButton() {}
	public void setCruiseCommand(Command_Car command)
	{
		button = command;
	}
	public void buttonPressed()
	{
		button.executeCommand();
	}

}
