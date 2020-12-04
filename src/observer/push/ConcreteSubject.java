package observer.push;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xiang
 * @date: 2020/11/30
 * @description:
 */
public class ConcreteSubject implements Subject {
    private Info info;
    private List<Observer> observerList = new ArrayList<>();

    public void setContent(Info info) {
        this.info = info;
        notifyAllObservers();
        observerList.iterator();
    }

    @Override
    public void notifyAllObservers() {
        for(Observer o : observerList) {
            o.update(info);
        }
    }

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }
}
