
public class TurnOnCDMusic implements Command_Car {
	MultimediaControls mc;
	public TurnOnCDMusic(MultimediaControls mc)
	{
		this.mc = mc;
	}
	public void executeCommand()
	{
		mc.turnOnMusic();
		mc.cdMode();
		mc.setVolume(14);
	}

}
