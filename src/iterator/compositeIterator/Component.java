package iterator.compositeIterator;

/**
 * @author: xiang
 * @date: 2020/12/9
 * @description:
 */
public abstract class Component {
    private String name;

    public Component(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract Iterator createIterator();
}
