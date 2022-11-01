package com.blushyes.factory.impl;

import com.blushyes.factory.AnimalFactory;
import com.blushyes.model.Animal;
import com.blushyes.model.impl.CatFromPetShopB;
import com.blushyes.model.impl.DogFromPetShopB;
import com.blushyes.model.impl.SheepFromPetShopB;

public class PetShopBFactory implements AnimalFactory {
    @Override
    public Animal getDog() {
        return new DogFromPetShopB();
    }

    @Override
    public Animal getCat() {
        return new CatFromPetShopB();
    }

    @Override
    public Animal getSheep() {
        return new SheepFromPetShopB();
    }
}
