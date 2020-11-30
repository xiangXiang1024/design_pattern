package singleton.multiton;

/**
 * @author: xiang
 * @date: 2020/11/27
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        for(int i = 0 ; i < 10 ; i++) {
            Multiton.getInstance();
        }
    }
}
