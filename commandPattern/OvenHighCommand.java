package commandPattern;

public class OvenHighCommand implements Command{

	Oven oven;
	int prevTemp;
	
	@Override
	public void execute() {
		prevTemp = oven.getTemp();
		oven.high();
	}

	@Override
	public void undo() {
		
		if(prevTemp == Oven.HIGH) {
			oven.high();
		} else if (prevTemp == Oven.MEDIUM){
			oven.medium();
		} else if (prevTemp == Oven.LOW) {
			oven.low();
		} else if (prevTemp == Oven.OFF) {
			oven.off();
		}
	}
}
