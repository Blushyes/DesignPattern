package com.blushyes;

import com.blushyes.entity.Phone;

public class BuilderPatternExtendDemo {
    public static void main(String[] args) {
        Phone phone = new Phone.PhoneBuilder()
                .battery("电池A")
                .chip("芯片A")
                .screen("屏幕A")
                .createPhone();
        System.out.println(phone);
    }
}
