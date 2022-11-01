package com.blushyes;

import com.blushyes.model.Animal;
import com.blushyes.factory.AnimalFactory;

/**
 *  分别用AnimalFactory创建Dog、Cat和Sheep，并分别调用cry方法
 *
 */
public class SimpleFactoryPatternDemo {
    public static void main( String[] args ) {
        //想要创建动物？但是又不想自己创建，那就交给AnimalFactory
        //首先实例化一个AnimalFactory
        AnimalFactory animalFactory = new AnimalFactory();
        //告诉AnimalFactory我要创建一只狗
        Animal dog = animalFactory.getAnimal("DOG");
        //告诉AnimalFactory我要创建一只猫
        Animal cat = animalFactory.getAnimal("CAT");
        //告诉AnimalFactory我要创建一只羊
        Animal sheep = animalFactory.getAnimal("SHEEP");
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
