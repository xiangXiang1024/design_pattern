package iterator;

/**
 * @author: xiang
 * @date: 2020/11/29
 * @description:
 */
public abstract class Iterator {
    private Aggregate aggregate;

    public Iterator(Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    Aggregate getAggregate() {
        return aggregate;
    }

    public abstract Object next();

    public abstract boolean hasNext();
}
