package com.blushyes;

import com.blushyes.factory.AnimalFactory;
import com.blushyes.factory.impl.PetShopAFactory;
import com.blushyes.factory.impl.PetShopBFactory;
import com.blushyes.model.Animal;

import java.util.List;

/**
 * 首先创建两个宠物店的工厂，然后分别利用两个宠物店工厂去创建对象
 *
 */
public class AbstractFactoryPatternDemo {
    public static void main( String[] args ) {
        //分别创建两个PetShopFactory
        AnimalFactory petShopA = new PetShopAFactory();
        AnimalFactory petShopB = new PetShopBFactory();
        //分别创建每个商店的每种宠物
        List<Animal> animals = List.of(petShopA.getDog(), petShopA.getCat(), petShopA.getSheep(), petShopB.getDog(), petShopB.getCat(), petShopB.getSheep());
        //调用所有动物的cry()
        for(Animal animal: animals){
            animal.cry();
        }
    }
}
