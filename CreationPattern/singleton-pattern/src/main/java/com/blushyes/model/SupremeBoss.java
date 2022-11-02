package com.blushyes.model;

public class SupremeBoss {
    private static final SupremeBoss supremeBoss = new SupremeBoss();
    private SupremeBoss(){}

    public void speak(){
        System.out.println("我是最大的老板！");
    }

    public static SupremeBoss getBoss(){
        return supremeBoss;
    }

}
