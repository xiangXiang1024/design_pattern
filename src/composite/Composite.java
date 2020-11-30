package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xiang
 * @date: 2020/11/28
 * @description:
 */
public class Composite extends Component {
    private List<Component> componentList = new ArrayList<>();

    public void add(Component component) {
        componentList.add(component);
    }

    public void remove(Component component) {
        componentList.remove(component);
    }

    public Component getChild(int i) {
        return componentList.get(i);
    }

    public void operation() {
        for(Component c : componentList) {
            c.operation();
        }
    }
}
