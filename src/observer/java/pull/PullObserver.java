package observer.java.pull;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: xiang
 * @date: 2020/12/5
 * @description:
 */
public class PullObserver implements Observer {
    Observable observable;

    public PullObserver(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        Data data = (Data)observable;
        System.out.println("todo pull observer get data1");
        System.out.println("data1: " + data.getData1());
    }
}
