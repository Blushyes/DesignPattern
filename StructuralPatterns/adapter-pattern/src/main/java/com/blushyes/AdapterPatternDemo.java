package com.blushyes;

import com.blushyes.impl.NewInterfaceImpl;
import com.blushyes.impl.OldInterfaceImpl;
import com.blushyes.impl.OldServeAdapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        //现在的客户端Client只能接收新接口
        Client client = new Client(new NewInterfaceImpl());
        client.useServe();
        //但是现在需要适配老接口，使用老服务，则需要适配器来解决
        OldServeAdapter oldServeAdapter = new OldServeAdapter(new OldInterfaceImpl());
        client.setServe(oldServeAdapter);
        client.useServe();
    }
}
