package com.blushyes;

import com.blushyes.impl.*;

public class BridgePatternDemo {
    public static void main(String[] args) {
        //创建三种颜色的画笔
        RedBrush red = new RedBrush();
        BlackBrush black = new BlackBrush();
        YellowBrush yellow = new YellowBrush();
        //创建一个圆形并用各种笔刷画
        Shape circle = new Circle();
        circle.setDraw(red);
        circle.draw();
        circle.setDraw(black);
        circle.draw();
        circle.setDraw(yellow);
        circle.draw();
        //创建一个正方形并用各种笔刷画
        Shape square = new Square();
        square.setDraw(red);
        square.draw();
        square.setDraw(black);
        square.draw();
        square.setDraw(yellow);
        square.draw();
        //创建一个三角形并用各种笔刷画
        Shape triangle = new Triangle();
        triangle.setDraw(red);
        triangle.draw();
        triangle.setDraw(black);
        triangle.draw();
        triangle.setDraw(yellow);
        triangle.draw();
    }
}
