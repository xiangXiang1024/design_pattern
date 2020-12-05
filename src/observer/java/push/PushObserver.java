package observer.java.push;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: xiang
 * @date: 2020/12/5
 * @description:
 */
public class PushObserver implements Observer {
    Observable observable;

    public PushObserver(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Data) {
            Data data = (Data)o;
            System.out.println("push observer get data");
            System.out.println("data1: " + data.getData1());
        }
    }
}
