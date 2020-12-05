package observer.changeManager;

/**
 * @author: xiang
 * @date: 2020/12/5
 * @description:
 */
public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        System.out.println(name + " get update from subject");
        System.out.println("data1: " + ((ConcreteSubject)subject).getData1());
        System.out.println("data2: " + ((ConcreteSubject)subject).getData2());
    }
}
