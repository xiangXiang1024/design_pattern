package state.sharedState;

/**
 * @author: xiang
 * @date: 2020/12/4
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Switch switch1 = new Switch("switch1");
        Switch switch2 = new Switch("switch2");

        switch1.turnOn();
        switch2.turnOn();
        switch2.turnOff();
        switch1.turnOff();
    }
}
