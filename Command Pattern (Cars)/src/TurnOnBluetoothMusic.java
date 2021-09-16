
public class TurnOnBluetoothMusic implements Command_Car {
	MultimediaControls mc;
	public TurnOnBluetoothMusic(MultimediaControls mc)
	{
		this.mc = mc;
	}
	public void executeCommand()
	{
		mc.turnOnMusic();
		mc.bluetoothMode();
		mc.setVolume(12);
	}

}
