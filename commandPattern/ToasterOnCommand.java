package commandPattern;

public class ToasterOnCommand implements Command {
	
	Toaster toaster;
	
	public ToasterOnCommand(Toaster toaster) {
		this.toaster = toaster;
	}
	
	@Override
	public void execute() {
		toaster.on();
	}

	public void undo() {
		toaster.off();
	}
}
