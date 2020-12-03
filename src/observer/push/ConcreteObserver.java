package observer.push;

/**
 * @author: xiang
 * @date: 2020/11/30
 * @description:
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update(String content) {
        System.out.println("get from subject: " + content);
    }
}
