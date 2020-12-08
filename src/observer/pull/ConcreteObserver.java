package observer.pull;

/**
 * @author: xiang
 * @date: 2020/11/30
 * @description:
 */
public class ConcreteObserver implements Observer {
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("in update");
        System.out.println("get content: " + subject.getContent());
    }
}
