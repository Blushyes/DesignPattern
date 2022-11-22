package com.blushyes.impl;

import com.blushyes.Service;
import com.blushyes.ServiceDecorator;

public class Expansion1 extends ServiceDecorator {
    public Expansion1(Service service) {
        super(service);
    }

    @Override
    public void use() {
        getService().use();
        System.out.println("公司1专属扩展......");
    }
}
