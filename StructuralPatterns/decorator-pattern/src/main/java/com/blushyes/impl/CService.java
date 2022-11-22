package com.blushyes.impl;

import com.blushyes.Service;

public class CService implements Service {
    @Override
    public void use() {
        System.out.println("C服务执行中......");
    }
}
