package com.blushyes.impl;

import com.blushyes.Brush;

public class BlackBrush implements Brush {
    @Override
    public void draw() {
        System.out.print("画了一个黑色的");
    }
}
