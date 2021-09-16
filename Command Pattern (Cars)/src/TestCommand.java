
//I implemented the Design pattern on Car
//I implemented it for 2 things/modules of the car
//For accelration as it was described in instruction,, In car I chose it to set Cruise control

//2nd module is multimedia control

// We can add as many modules as we can, For example, Side mirrors of Car can be a separate module, 
// Meter reading and millage check and set the modes i.e. Eco, Sports, normal this can be also a separate module


public class TestCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Cruise Module
		System.out.println(" =======================  Cruise Module  ===========================");
		CruiseButton cbutton = new CruiseButton();
		Cruise_Command cruise = new Cruise_Command();
		
		cbutton.setCruiseCommand(new TurnOnCruise(cruise));
		cbutton.buttonPressed();
		cbutton.setCruiseCommand(new TurnOffCruise(cruise));
		cbutton.buttonPressed();
		//////////////////////////////////////////////////////////////////
		
		System.out.println("\n\n =======================  Multimedia Module  ===========================");
		MultimediaButton mbutton = new MultimediaButton();
		MultimediaControls mc = new MultimediaControls();
		
		mbutton.setControlCommand(new TurnOnBluetoothMusic(mc));
		mbutton.buttonPressed();
		mbutton.setControlCommand(new TurnOnCDMusic(mc));
		mbutton.buttonPressed();
		mbutton.setControlCommand(new TurnOffMultimedia(mc));
		mbutton.buttonPressed();

	}

}
