package observer.changeManager;

/**
 * @author: xiang
 * @date: 2020/12/5
 * @description:
 */
public interface Subject {
    void attach(Observer observer);

    void unAttach(Observer observer);

    void notifyAllObservers();
}
