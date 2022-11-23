package com.blushyes.impl;

import com.blushyes.Shape;

public class Square extends Shape {
    @Override
    public void draw() {
        getDraw().draw();
        System.out.println("正方形");
    }
}
