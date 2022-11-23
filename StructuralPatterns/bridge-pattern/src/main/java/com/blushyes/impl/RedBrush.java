package com.blushyes.impl;

import com.blushyes.Brush;

public class RedBrush implements Brush {
    @Override
    public void draw() {
        System.out.print("画了一个红色的");
    }
}
