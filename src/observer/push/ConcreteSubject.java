package observer.push;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xiang
 * @date: 2020/11/30
 * @description:
 */
public class ConcreteSubject implements Subject {
    private String content;
    private List<Observer> observerList = new ArrayList<>();

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyAllObservers();
        observerList.iterator();
    }

    @Override
    public void notifyAllObservers() {
        for(Observer o : observerList) {
            o.update(content);
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
