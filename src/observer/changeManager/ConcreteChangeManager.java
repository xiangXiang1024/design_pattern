package observer.changeManager;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: xiang
 * @date: 2020/12/5
 * @description:
 */
public class ConcreteChangeManager extends ChangeManager {
    @Override
    public void register(Subject subject, Observer observer) {
        Set<Observer> observerSet = new HashSet<>();
        if(mapping.containsKey(subject)) {
            observerSet = mapping.get(subject);
        }
        observerSet.add(observer);
        mapping.put(subject, observerSet);
    }

    @Override
    public void unRegister(Subject subject, Observer observer) {
        if(mapping.containsKey(subject)) {
            Set<Observer> observerSet = mapping.get(subject);
            observerSet.remove(observer);
            mapping.put(subject, observerSet);
        }
    }

    @Override
    public void notify(Subject subject) {
        if(mapping.containsKey(subject)) {
            Set<Observer> observerSet = mapping.get(subject);
            for(Observer observer : observerSet) {
                observer.update(subject);
            }
        }
    }
}
