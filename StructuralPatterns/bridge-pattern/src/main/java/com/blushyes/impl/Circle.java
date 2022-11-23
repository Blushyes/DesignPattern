package com.blushyes.impl;

import com.blushyes.Shape;

public class Circle extends Shape {
    @Override
    public void draw() {
        getDraw().draw();
        System.out.println("圆");
    }
}
