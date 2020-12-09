package iterator.compositeIterator;

/**
 * @author: xiang
 * @date: 2020/12/9
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Component component = getComponent();
        Iterator iterator = component.createIterator();
        while(iterator.hasNext()) {
            System.out.println(((Component)iterator.next()).getName());
        }
    }

    private static Component getComponent() {
        Component node1, node2, node3, node4, node5, node6;
        node6 = new Leaf("6");
        Component[] components1 = {node6};
        node5 = new Leaf("5");
        Component[] components2 = {node5, node6};
        node3 = new Composite("3", components2);
        node2 = new Leaf("2");
        node4 = new Leaf("4");
        Component[] components3 = {node2, node3, node4};
        node1 = new Composite("1", components3);
        return node1;
    }
}
