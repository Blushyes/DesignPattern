package com.blushyes.model.impl;

import com.blushyes.model.Animal;

public class SheepFromPetShopB implements Animal {
    @Override
    public void cry() {
        System.out.print("我是来自B宠物店的宠物：");
        System.out.println("咩！");
    }
}
