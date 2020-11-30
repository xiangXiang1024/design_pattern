package decorator;

/**
 * @author: xiang
 * @date: 2020/11/30
 * @description:
 */
public class ConcreteComponent extends Component {
    @Override
    public void doSomething() {
        System.out.println("concrete component do something");
    }
}
