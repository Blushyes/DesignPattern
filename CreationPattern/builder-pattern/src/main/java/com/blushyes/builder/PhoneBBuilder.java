package com.blushyes.builder;

import com.blushyes.entity.Phone;

public class PhoneBBuilder extends PhoneBuilder {
    @Override
    public void chip() {
        phone.setChip("芯片B");
    }

    @Override
    public void screen() {
        phone.setScreen("屏幕B");
    }

    @Override
    public void battery() {
        phone.setBattery("电池B");
    }

    @Override
    public Phone createPhone() {
        return phone;
    }
}
