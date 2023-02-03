package recursion;
import recursion.awt.WidgetType;
import list.*;

public class Widget extends Component {
	WidgetType type;

	public Widget(String name, WidgetType type) {
		this.name = name;
		this.type = type;
	}

	public List<Widget> getAllWidgets() {
		List<Widget> widgetList = new LinkedList<Widget>();
		widgetList.add(this);
		return widgetList;
	}

	public void show() {
		System.out.println(name);
	}
	
	public String toString() {
		return name;
	}
}
