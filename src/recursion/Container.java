package recursion;
import list.*;

public class Container extends Component {
	List<Component> components = new LinkedList<Component>();
	
	public Container(String name) {
		this.name = name;
	}
	
	public void addComponent(Component component) {
		components.add(component);
	}

	public List<Widget> getAllWidgets() {
		List<Widget> widgetList = new LinkedList<Widget>();
		Iterator<Component> it = components.iterator();
		while(it.hasNext()) {
			widgetList.addAll(it.next().getAllWidgets());
		}
		return widgetList;
	}

	public void show() {
		System.out.println(name);
		Iterator<Component> it = components.iterator();
		while(it.hasNext()) {
			it.next().show();
		}
		
	}
	
}
