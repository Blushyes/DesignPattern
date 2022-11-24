package com.blushyes;

import com.blushyes.impl.Circle;
import com.blushyes.impl.Square;
import com.blushyes.impl.Triangle;

public class ShapeMaker {
    private final Shape circle = new Circle();
    private final Shape square = new Square();
    private final Shape triangle = new Triangle();

    public void drawCircle(){
        circle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

    public void drawTriangle() {
        triangle.draw();
    }
}
