package iterator;

/**
 * @author: xiang
 * @date: 2020/11/29
 * @description:
 */
public class ConcreteIterator extends Iterator {
    private int index;

    public ConcreteIterator(Aggregate aggregate) {
        super(aggregate);
        index = 0;
    }

    @Override
    public Object next() {
        index++;
        return ((ConcreteAggregate)getAggregate()).getList().get(index-1);
    }

    @Override
    public boolean hasNext() {
        return index+1 < ((ConcreteAggregate)getAggregate()).getList().size();
    }
}
