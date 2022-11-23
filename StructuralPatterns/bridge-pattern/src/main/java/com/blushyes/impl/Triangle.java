package com.blushyes.impl;

import com.blushyes.Shape;

public class Triangle extends Shape {
    @Override
    public void draw() {
        getDraw().draw();
        System.out.println("三角形");
    }
}
