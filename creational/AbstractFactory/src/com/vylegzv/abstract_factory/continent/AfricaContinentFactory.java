package com.vylegzv.abstract_factory.continent;

import com.vylegzv.abstract_factory.animals.Animal;
import com.vylegzv.abstract_factory.animals.Camel;
import com.vylegzv.abstract_factory.animals.Giraffe;
import com.vylegzv.abstract_factory.animals.Lion;
import com.vylegzv.abstract_factory.mountains.EasternRiftMountains;
import com.vylegzv.abstract_factory.mountains.Mountains;
import com.vylegzv.abstract_factory.plants.Aloe;
import com.vylegzv.abstract_factory.plants.Baobab;
import com.vylegzv.abstract_factory.plants.Plant;
import com.vylegzv.abstract_factory.rivers.NileRiver;
import com.vylegzv.abstract_factory.rivers.River;

/**
 * Africa continent concrete factory.
 * 
 * @author vella
 *
 */
public class AfricaContinentFactory implements ContinentFactory {

  @Override
  public Mountains createMountains() {
    return new EasternRiftMountains();
  }

  @Override
  public River createRiver() {
    return new NileRiver();
  }

  @Override
  public Plant[] createPlants() {
    Plant[] plants = {new Aloe(), new Baobab()};
    return plants;
  }

  @Override
  public Animal[] createAnimals() {
    Animal[] animals = {new Camel(), new Giraffe(), new Lion()};
    return animals;
  }
}
