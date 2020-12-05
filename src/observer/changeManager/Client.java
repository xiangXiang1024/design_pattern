package observer.changeManager;

/**
 * @author: xiang
 * @date: 2020/12/5
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject("data1", "data2");
        Observer observer1 = new ConcreteObserver("observer1");
        Observer observer2 = new ConcreteObserver("observer2");
        subject.attach(observer1);
        subject.attach(observer2);

        subject.setChange("changed data 1", "changed data 2");

        subject.unAttach(observer1);
        subject.setChange("data 1", "data 2");
    }
}
