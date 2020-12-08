package proxy.protectionProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author: xiang
 * @date: 2020/12/8
 * @description:
 */
public class OtherInvocationHandler implements InvocationHandler {
    private PersonBean person;

    public OtherInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try{
            if(method.getName().equals("setHotOrNotRating")) {
                return method.invoke(person, args);
            }else if(method.getName().startsWith("get")) {
                return method.invoke(person, args);
            }else {
                throw new IllegalAccessException();
            }
        }catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
