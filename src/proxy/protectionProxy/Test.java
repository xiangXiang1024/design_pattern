package proxy.protectionProxy;

import java.lang.reflect.Proxy;

/**
 * @author: xiang
 * @date: 2020/12/8
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.drive();
    }

    private void drive() {
        PersonBean person = new PersonBeanImpl("name1", "interest1");

        PersonBean ownerProxy = getOwnerProxy(person);
        System.out.println("owner operation:");
        System.out.println("name: " + ownerProxy.getName());
        System.out.println("interests: " + ownerProxy.getInterests());
        System.out.println("rating: " + ownerProxy.getHotOrNotRating());

        System.out.println("==========");

        PersonBean otherProxy = getOtherProxy(person);
        System.out.println("other operation:");
        System.out.println("name: " + otherProxy.getName());
        System.out.println("interests: " + otherProxy.getInterests());
        System.out.println("rating: " + otherProxy.getHotOrNotRating());
        System.out.println("todo: set rating 5: ");
        otherProxy.setHotOrNotRating(5);
        System.out.println("rating: " + ownerProxy.getHotOrNotRating());
        System.out.println("todo: set rating 4: ");
        otherProxy.setHotOrNotRating(4);
        System.out.println("rating: " + ownerProxy.getHotOrNotRating());

    }

    private PersonBean getOtherProxy(PersonBean person) {
        return (PersonBean)Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OtherInvocationHandler(person)
        );
    }

    private PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person)
        );
    }
}
