package commandPattern;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestCase {

	@Test
	void test() {
		
		Remote remote = new Remote();
		Toaster toaster = new Toaster();
		Oven oven = new Oven(null);
		ToasterOnCommand toasterOn = new ToasterOnCommand(toaster);
		ToasterOffCommand toasterOff = new ToasterOffCommand(toaster);
		OvenHighCommand ovenHigh = new OvenHighCommand();
		OvenMediumCommand ovenMedium = new OvenMediumCommand();
		OvenLowCommand ovenLow = new OvenLowCommand();
		OvenOffCommand ovenOff = new OvenOffCommand();
		
		remote.setCommand(0, toasterOn, toasterOff);
		
		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);
		remote.undoBottonWasPushed();
		
		remote.setCommand(1, ovenHigh, ovenOff);
	
		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);
		remote.undoBottonWasPushed();
		
		remote.setCommand(2, ovenMedium, ovenOff);
		
		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);
		remote.undoBottonWasPushed();
		
		remote.setCommand(3, ovenLow, ovenOff);
		
		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);
		remote.undoBottonWasPushed();
		
		System.out.println(remote);
	}

}
