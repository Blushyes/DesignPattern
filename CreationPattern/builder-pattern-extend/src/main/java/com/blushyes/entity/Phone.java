package com.blushyes.entity;

/**
 * 手机实体类
 */
public class Phone {
    private String chip;
    private String screen;
    private String battery;

    @Override
    public String toString() {
        return "Phone{" +
                "chip='" + chip + '\'' +
                ", screen='" + screen + '\'' +
                ", battery='" + battery + '\'' +
                '}';
    }

    //参数为PhoneBuilder
    public Phone(PhoneBuilder phoneBuilder) {
        this.chip = phoneBuilder.chip;
        this.screen = phoneBuilder.screen;
        this.battery = phoneBuilder.battery;
    }

    public static final class PhoneBuilder{
        private String chip;
        private String screen;
        private String battery;

        //返回自己可以链式编程
        public PhoneBuilder chip(String chip){
            this.chip = chip;
            return this;
        }

        public PhoneBuilder screen(String screen){
            this.screen = screen;
            return this;

        }

        public PhoneBuilder battery(String battery){
            this.battery = battery;
            return this;

        }

        public Phone createPhone(){
            return new Phone(this);
        }
    }
}
