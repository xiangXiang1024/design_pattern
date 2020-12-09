package iterator.compositeIterator;

/**
 * @author: xiang
 * @date: 2020/12/9
 * @description:
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
