
public class TurnOnCruise implements Command_Car {
	
	Cruise_Command cruise;
	public TurnOnCruise(Cruise_Command cruise)
	{
		this.cruise=cruise;
	}
	public void executeCommand()
	{
		cruise.turnOnCruise();
		cruise.setSpeed(60);
	}

}
