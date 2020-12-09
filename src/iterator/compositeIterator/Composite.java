package iterator.compositeIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xiang
 * @date: 2020/12/9
 * @description:
 */
public class Composite extends Component {
    private Component[] componentList;

    public Composite(String name, Component[] componentList) {
        super(name);
        this.componentList = componentList;
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(new ListIterator(componentList));
    }
}

class ListIterator implements Iterator {
    private Component[] componentList;
    private int currentPos;

    public ListIterator(Component[] componentList) {
        this.componentList = componentList;
        currentPos = -1;
    }

    @Override
    public boolean hasNext() {
        return currentPos < componentList.length - 1;
    }

    @Override
    public Object next() {
        if(hasNext()) {
            currentPos++;
            return componentList[currentPos];
        }
        return null;
    }
}
