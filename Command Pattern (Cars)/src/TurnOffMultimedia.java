
public class TurnOffMultimedia implements Command_Car {
	MultimediaControls mc;
	public TurnOffMultimedia(MultimediaControls mc)
	{
		this.mc = mc;
	}
	public void executeCommand()
	{
		mc.turnOffMusic();
	}


}
