package observer.changeManager;

import java.util.*;

/**
 * @author: xiang
 * @date: 2020/12/5
 * @description:
 */
public abstract class ChangeManager {
    protected Map<Subject, Set<Observer>> mapping;

    public ChangeManager() {
        mapping = new HashMap<>();
    }

    public abstract void register(Subject subject, Observer observer);

    public abstract void unRegister(Subject subject, Observer observer);

    public abstract void notify(Subject subject);
}
