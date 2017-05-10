package com.vylegzv.abstract_factory.continent;

import com.vylegzv.abstract_factory.animals.Animal;
import com.vylegzv.abstract_factory.mountains.Mountains;
import com.vylegzv.abstract_factory.plants.Plant;
import com.vylegzv.abstract_factory.rivers.River;

/**
 * ContinentFactory factory interface.
 * 
 * @author vella
 *
 */
public interface ContinentFactory {

  Mountains createMountains();

  River createRiver();

  Plant[] createPlants();

  Animal[] createAnimals();
}
