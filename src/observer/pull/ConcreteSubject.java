package observer.pull;

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
    private boolean isChanged = false;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyAllObservers();
    }

    public void setChanged() {
        isChanged = true;
    }

    @Override
    public void notifyAllObservers() {
        if(isChanged) {
            for(Observer o : observerList) {
                o.update();
            }
            isChanged = false;
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
