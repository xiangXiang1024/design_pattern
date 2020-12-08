package proxy.remoteProxy.server;

import java.io.Serializable;

/**
 * @author: xiang
 * @date: 2020/12/8
 * @description:
 */
public class Data implements Serializable {
    transient DataChild dataChild;
    String data3;
    String data4;

    public DataChild getDataChild() {
        return dataChild;
    }

    public void setDataChild(DataChild dataChild) {
        this.dataChild = dataChild;
    }

    public String getData3() {
        return data3;
    }

    public void setData3(String data3) {
        this.data3 = data3;
    }

    public String getData4() {
        return data4;
    }

    public void setData4(String data4) {
        this.data4 = data4;
    }
}
