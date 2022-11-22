package com.blushyes.impl;

import com.blushyes.Service;

public class BService implements Service {
    @Override
    public void use() {
        System.out.println("B服务执行中......");
    }
}
