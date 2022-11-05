package com.blushyes.builder;

import com.blushyes.entity.Phone;

/**
 * 手机建造器接口
 */
public abstract class PhoneBuilder {
    protected Phone phone = new Phone();
    public abstract void chip();
    public abstract void screen();
    public abstract void battery();
    public abstract Phone createPhone();
}