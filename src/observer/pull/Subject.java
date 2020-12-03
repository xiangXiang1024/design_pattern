package observer.pull;

/**
 * @author: xiang
 * TODO
 * @date: 2020/11/30
 * @description:
 */
public interface Subject {
    void notifyAllObservers();

    void register(Observer observer);

    void remove(Observer observer);
}
