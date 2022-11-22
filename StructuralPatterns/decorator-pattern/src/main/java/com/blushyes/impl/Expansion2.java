package com.blushyes.impl;

import com.blushyes.Service;
import com.blushyes.ServiceDecorator;

public class Expansion2 extends ServiceDecorator {
    public Expansion2(Service service) {
        super(service);
    }

    @Override
    public void use() {
        getService().use();
        System.out.println("公司2专属扩展......");
    }
}
