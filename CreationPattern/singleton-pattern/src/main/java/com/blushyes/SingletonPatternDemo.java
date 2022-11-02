package com.blushyes;

import com.blushyes.model.SupremeBoss;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        SupremeBoss supremeBoss = SupremeBoss.getBoss();
        supremeBoss.speak();
    }
}

