package proxy.remoteProxy.client;

import proxy.remoteProxy.server.MyRemote;

import java.rmi.Naming;

/**
 * @author: xiang
 * @date: 2020/12/8
 * @description: 客户端
 */
public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try{
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            System.out.println(service.sayHello());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
