package com.blushyes.impl;

import com.blushyes.Service;

public class AService implements Service {
    @Override
    public void use() {
        System.out.println("A服务执行中......");
    }
}
