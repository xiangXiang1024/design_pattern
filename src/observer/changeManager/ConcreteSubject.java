package observer.changeManager;

/**
 * @author: xiang
 * @date: 2020/12/5
 * @description:
 */
public class ConcreteSubject implements Subject {
    private String data1;
    private String data2;
    private ChangeManager changeManager;

    public ConcreteSubject(String data1, String data2) {
        this.data1 = data1;
        this.data2 = data2;
        changeManager = new ConcreteChangeManager();
    }

    @Override
    public void attach(Observer observer) {
        changeManager.register(this, observer);
    }

    @Override
    public void unAttach(Observer observer) {
        changeManager.unRegister(this, observer);
    }

    @Override
    public void notifyAllObservers() {
        changeManager.notify(this);
    }

    public void setChange(String data1, String data2) {
        this.data1 = data1;
        this.data2 = data2;
        notifyAllObservers();
    }

    public String getData1() {
        return data1;
    }

    public String getData2() {
        return data2;
    }
}
