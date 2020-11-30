package composite;

/**
 * @author: xiang
 * @date: 2020/11/28
 * @description:
 */
public abstract class Component {
    public void add(Component component) {
        throw new UnSupportedException();
    }

    public void remove(Component component) {
        throw new UnSupportedException();
    }

    public Component getChild(int i) {
        throw new UnSupportedException();
    }

    public void operation() {
        throw new UnSupportedException();
    }
}
