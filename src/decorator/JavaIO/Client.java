package decorator.JavaIO;

import java.io.*;

/**
 * @author: xiang
 * @date: 2020/12/4
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        int c;
        InputStream in = null;
        try{
            in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/decorator/JavaIO/test.txt")));
            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
