package com.blushyes.factory.impl;

import com.blushyes.factory.AnimalFactory;
import com.blushyes.model.Animal;
import com.blushyes.model.impl.Sheep;

public class SheepFactory implements AnimalFactory {
    @Override
    public Animal getAnimal() {
        return new Sheep();
    }
}
