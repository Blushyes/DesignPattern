package com.blushyes;

import com.blushyes.factory.AnimalFactory;
import com.blushyes.factory.impl.CatFactory;
import com.blushyes.factory.impl.DogFactory;
import com.blushyes.factory.impl.SheepFactory;
import com.blushyes.model.Animal;

/**
 * 分别创建DogFactory、CatFactory和SheepFactory
 * 分别用对应的Factory创建对象
 * 调用创建对象的cry方法
 *
 */
public class FactoryMethodDemo {
    public static void main(String[] args) {
        //创建DogFactory并用其创建对应的Animal
        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.getAnimal();
        //创建DogFactory并用其创建对应的Animal
        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.getAnimal();
        //创建SheepFactory并用其创建对应的Animal
        AnimalFactory sheepFactory = new SheepFactory();
        Animal sheep = sheepFactory.getAnimal();
        //调用狗的cry方法
        System.out.print("dog的cry()：");
        dog.cry();
        //调用猫的cry方法
        System.out.print("cat的cry()：");
        cat.cry();
        //调用羊的cry方法
        System.out.print("sheep的cry()：");
        sheep.cry();
    }
}
