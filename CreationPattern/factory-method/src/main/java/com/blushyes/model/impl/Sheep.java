package com.blushyes.model.impl;

import com.blushyes.model.Animal;

public class Sheep implements Animal {
    @Override
    public void cry() {
        System.out.println("咩！");
    }
}
