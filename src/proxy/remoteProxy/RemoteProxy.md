# 远程代理

远程对象的本地代理

- 远程对象：一种对象，活在不同的Java虚拟机堆中（在不同地址空间运行的远程对象）

- 本地代理：一种可以由本地方法调用的对象，其行为会转发到远程对象中

客户对象所做的就像是在做远程方法调用，但其实只是调用本地堆中的“代理”对象上的方法，再由代理处理所有网络通信的细节

角色：客户对象、客户辅助对象、服务对象、服务辅助对象

- **客户对象**以为它调用的是远程服务上的方法，因为**客户辅助对象**乔装成服务对象，假装自己有客户所要调用的方法。

- **客户辅助对象**不是真正的远程服务，并不拥有客户所期望的方法逻辑。**客户辅助对象**会联系服务器，传送方法调用信息（如方法名、变量等），然后等待服务器的返回

- **服务辅助对象**从**客户辅助对象**中接受请求（通过socket连接），将调用信息解包，然后调用真正**服务对象**上的真正方法。

- 对于**服务对象**来说，调用是本地的，来自**服务辅助对象**，而不是远程客户。

- **服务辅助对象**从服务站得到返回值，将它打包，然后返回给**客户辅助对象**（通过socket的输出流）。**客户辅助对象**对信息解包，将返回值交给**客户对象**。

## RMI

- 提供了客户辅助对象（RMI STUB）和服务辅助对象（RMI SKELETON）
    
    - 不必再写网络、IO代码

- 提供了运行时的基础设施

    - 查找服务：用了寻找和访问远程对象
    
- 网络和IO是有风险的，随时可能会抛出异常

### 服务端

- 远程接口：

    - 扩展import java.rmi.Remote接口

    - 接口中方法需声明异常：RemoteException

    - 变量和返回值是属于原语（primitive）类型或可序列化（serializable）类型
    
        - 不想要序列化的字段加上transient关键字

- 远程实现：

    - 实现远程接口
    
    - 继承自import java.rmi.server.UnicastRemoteObject类，并声明一个抛出RemoteException异常的构造器
    
    - 用RMI Registry注册服务(java.rmi.Naming类)
  ```java
    try{
        MyRemote service=new MyRemoteImpl();
        Naming.rebind("RemoteHello",service);
    } catch(Exception ex) {
        // ...
    }
  ```

- 产生Stub和Skeleton

    - 在远程实现类上执行rmic
    ```
      rmic MyRemoteImpl
    ```
    
- 执行remiregistry

- 启动服务

### 客户端

- 到RMI registry中寻找

- RMI registry返回stub对象

- 客户调用stub方法

客户获取stub类：

- 动态类下载