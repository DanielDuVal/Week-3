package commandPattern;

public class ToasterOffCommand implements Command{

	Toaster toaster;
	
	public ToasterOffCommand(Toaster toaster) {
		this.toaster = toaster;
	}
	
	@Override
	public void execute() {
		toaster.off();
	}

	public void undo() {
		toaster.on();
	}
}
