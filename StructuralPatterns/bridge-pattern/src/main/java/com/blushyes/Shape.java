package com.blushyes;

public abstract class Shape {
    private Brush brush;

    abstract public void draw();

    public Brush getDraw() {
        return brush;
    }

    public void setDraw(Brush brush) {
        this.brush = brush;
    }
}
