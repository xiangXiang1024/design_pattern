package proxy.remoteProxy.server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author: xiang
 * @date: 2020/12/8
 * @description: 远程服务（实现）
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    protected MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() {
        return "Server says: hello";
    }

    @Override
    public Data getData() throws RemoteException {
        return new Data();
    }

    public static void main(String[] args) {
        try{
            MyRemote remote = new MyRemoteImpl();
            Naming.rebind("RemoteHello", remote);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
