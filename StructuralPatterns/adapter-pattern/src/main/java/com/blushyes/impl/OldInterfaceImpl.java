package com.blushyes.impl;

import com.blushyes.OldInterface;

public class OldInterfaceImpl implements OldInterface {
    @Override
    public void oldServe() {
        System.out.println("旧服务执行中......");
    }
}
