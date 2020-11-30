package decorator;

/**
 * @author: xiang
 * @date: 2020/11/30
 * @description:
 */
public abstract class Decorator extends Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public Component getComponent() {
        return component;
    }
}
