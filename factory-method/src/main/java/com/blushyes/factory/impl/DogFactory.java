package com.blushyes.factory.impl;

import com.blushyes.factory.AnimalFactory;
import com.blushyes.model.Animal;
import com.blushyes.model.impl.Dog;

public class DogFactory implements AnimalFactory {
    @Override
    public Animal getAnimal() {
        return new Dog();
    }
}
