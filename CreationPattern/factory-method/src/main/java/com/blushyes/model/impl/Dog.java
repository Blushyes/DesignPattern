package com.blushyes.model.impl;

import com.blushyes.model.Animal;

public class Dog implements Animal {
    @Override
    public void cry() {
        System.out.println("汪！");
    }
}
