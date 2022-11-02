package com.blushyes.factory.impl;

import com.blushyes.factory.AnimalFactory;
import com.blushyes.model.Animal;
import com.blushyes.model.impl.CatFromPetShopA;
import com.blushyes.model.impl.DogFromPetShopA;
import com.blushyes.model.impl.SheepFromPetShopA;

public class PetShopAFactory implements AnimalFactory {
    @Override
    public Animal getDog() {
        return new DogFromPetShopA();
    }

    @Override
    public Animal getCat() {
        return new CatFromPetShopA();
    }

    @Override
    public Animal getSheep() {
        return new SheepFromPetShopA();
    }
}
