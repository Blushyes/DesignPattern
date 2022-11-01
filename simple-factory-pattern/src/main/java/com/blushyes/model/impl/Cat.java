package com.blushyes.model.impl;

import com.blushyes.model.Animal;

public class Cat implements Animal {
    @Override
    public void cry() {
        System.out.println("喵！");
    }
}
