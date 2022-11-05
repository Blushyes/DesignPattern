package com.blushyes.director;

import com.blushyes.builder.PhoneBuilder;
import com.blushyes.entity.Phone;

/**
 * 手机的导演类，指导进行装配
 */
public class PhoneDirector {
    private final PhoneBuilder phoneBuilder;

    public PhoneDirector(PhoneBuilder phoneBuilder){
        this.phoneBuilder = phoneBuilder;
    }

    public Phone createPhone(){
        //分别对各个属性进行装配
        phoneBuilder.chip();
        phoneBuilder.screen();
        phoneBuilder.battery();
        //将成品返回
        return phoneBuilder.createPhone();
    }
}
