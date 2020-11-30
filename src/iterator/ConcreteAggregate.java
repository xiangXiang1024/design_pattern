package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xiang
 * @date: 2020/11/29
 * @description:
 */
public class ConcreteAggregate extends Aggregate {
    private List<Integer> list = new ArrayList<>();

    public List<Integer> getList() {
        return list;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}
