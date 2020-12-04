package observer.push;

/**
 * @author: xiang
 * @date: 2020/11/30
 * @description:
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update(Info info) {
        System.out.println("get content1 from subject: " + info.getContent1());
    }
}
