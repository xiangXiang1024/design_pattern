package observer.java.push;

import java.util.Observable;

/**
 * @author: xiang
 * @date: 2020/12/5
 * @description:
 */
public class Data extends Observable {
    private String data1;
    private String data2;

    public void setData(String data1, String data2) {
        this.data1 = data1;
        this.data2 = data2;
        setChanged();
        notifyObservers(this);
    }

    public String getData1() {
        return data1;
    }

    public String getData2() {
        return data2;
    }
}
