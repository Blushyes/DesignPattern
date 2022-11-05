package com.blushyes.builder;

import com.blushyes.entity.Phone;

public class PhoneABuilder extends PhoneBuilder {
    @Override
    public void chip() {
        phone.setChip("芯片A");
    }

    @Override
    public void screen() {
        phone.setScreen("屏幕A");
    }

    @Override
    public void battery() {
        phone.setBattery("电池A");
    }

    @Override
    public Phone createPhone() {
        return phone;
    }
}
