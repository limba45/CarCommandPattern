
public class TurnOffCruise implements Command_Car {
	
	Cruise_Command cruise;
	public TurnOffCruise(Cruise_Command cruise)
	{
		this.cruise=cruise;
	}
	public void executeCommand()
	{
		cruise.turnOffCruise();
	}

}
