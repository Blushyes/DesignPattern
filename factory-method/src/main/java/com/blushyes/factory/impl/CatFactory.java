package com.blushyes.factory.impl;

import com.blushyes.factory.AnimalFactory;
import com.blushyes.model.Animal;
import com.blushyes.model.impl.Cat;

public class CatFactory implements AnimalFactory {
    @Override
    public Animal getAnimal() {
        return new Cat();
    }
}
