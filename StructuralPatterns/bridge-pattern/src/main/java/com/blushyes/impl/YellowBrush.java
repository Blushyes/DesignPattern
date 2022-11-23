package com.blushyes.impl;

import com.blushyes.Brush;

public class YellowBrush implements Brush {
    @Override
    public void draw() {
        System.out.print("画了一个黄色的");
    }
}
