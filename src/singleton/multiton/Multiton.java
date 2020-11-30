package singleton.multiton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author: xiang
 * @date: 2020/11/27
 * @description:
 */
public class Multiton {
    private static List<Multiton> instanceList;
    private static final int INSTANCE_COUNT = 2;

    static {
        instanceList = new ArrayList<>();
        for(int i = 0 ; i <  INSTANCE_COUNT ; i++) {
            instanceList.add(new Multiton());
        }
    }

    private Multiton() {}

    public static Multiton getInstance(int i) {
        if(i < INSTANCE_COUNT) {
            return instanceList.get(i);
        }else {
            return null;
        }
    }

    public static Multiton getInstance() {
        Random random = new Random();
        int i = random.nextInt(INSTANCE_COUNT);
        return getInstance(i);
    }
}
