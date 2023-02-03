package recursion;
import list.List;

public abstract class Component {
	String name;
	
	public abstract List<Widget> getAllWidgets();
	
	public abstract void show();
}
