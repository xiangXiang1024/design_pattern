package proxy.remoteProxy.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author: xiang
 * @date: 2020/12/8
 * @description: 远程接口
 */
public interface MyRemote extends Remote {
    String sayHello() throws RemoteException;
    Data getData() throws RemoteException;
}
