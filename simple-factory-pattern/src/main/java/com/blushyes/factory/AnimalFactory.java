package com.blushyes.factory;

import com.blushyes.model.Animal;
import com.blushyes.model.impl.Cat;
import com.blushyes.model.impl.Dog;
import com.blushyes.model.impl.Sheep;

public class AnimalFactory {
    public Animal getAnimal(String animalType){
        if(animalType == null){
            return null;
        }
        if(animalType.equalsIgnoreCase("DOG")){
            return new Dog();
        } else if(animalType.equalsIgnoreCase("CAT")){
            return new Cat();
        } else if(animalType.equalsIgnoreCase("SHEEP")){
            return new Sheep();
        }
        return null;
    }
}
