package com.blushyes;

import com.blushyes.builder.PhoneABuilder;
import com.blushyes.builder.PhoneBBuilder;
import com.blushyes.director.PhoneDirector;
import com.blushyes.entity.Phone;

/**
 * 对建造者模式进行测试
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        //创建对应的导演类
        PhoneDirector phoneADirector = new PhoneDirector(new PhoneABuilder());
        PhoneDirector phoneBDirector = new PhoneDirector(new PhoneBBuilder());
        //分别创建两种类型的Phone
        Phone phoneA = phoneADirector.createPhone();
        Phone phoneB = phoneBDirector.createPhone();
        //查看两个类的属性
        System.out.println(phoneA);
        System.out.println(phoneB);
    }
}
