package com.blushyes.impl;

import com.blushyes.Service;
import com.blushyes.ServiceDecorator;

public class Expansion3 extends ServiceDecorator {
    public Expansion3(Service service) {
        super(service);
    }

    @Override
    public void use() {
        getService().use();
        System.out.println("公司3专属扩展......");
    }
}
