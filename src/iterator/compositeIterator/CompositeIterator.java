package iterator.compositeIterator;

import java.util.Stack;

/**
 * @author: xiang
 * @date: 2020/12/9
 * @description:
 */
public class CompositeIterator implements Iterator {
    private Stack stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.empty()) {
            return false;
        }else {
            Iterator iterator = (Iterator)stack.peek();
            if(!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            }else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if(hasNext()) {
            Iterator iterator = (Iterator)stack.peek();
            Component component = (Component)iterator.next();
            stack.push(component.createIterator());
            return component;
        }else {
            return null;
        }
    }
}
