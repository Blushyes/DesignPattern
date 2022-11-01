package com.blushyes.factory;

import com.blushyes.model.Animal;

public interface AnimalFactory {
    Animal getDog();
    Animal getCat();
    Animal getSheep();
}
