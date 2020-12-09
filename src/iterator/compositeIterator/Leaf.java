package iterator.compositeIterator;

/**
 * @author: xiang
 * @date: 2020/12/9
 * @description:
 */
public class Leaf extends Component{
    public Leaf(String name) {
        super(name);
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
