package observer.java.push;

import java.util.Observer;

/**
 * @author: xiang
 * @date: 2020/12/5
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Data data = new Data();
        Observer observer = new PushObserver(data);
        data.setData("1", "2");
    }
}
