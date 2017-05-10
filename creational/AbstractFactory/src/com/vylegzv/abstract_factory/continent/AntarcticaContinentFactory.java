package com.vylegzv.abstract_factory.continent;

import com.vylegzv.abstract_factory.animals.Animal;
import com.vylegzv.abstract_factory.animals.Penguin;
import com.vylegzv.abstract_factory.animals.Seal;
import com.vylegzv.abstract_factory.animals.Whale;
import com.vylegzv.abstract_factory.mountains.Mountains;
import com.vylegzv.abstract_factory.mountains.TransantarcticMountains;
import com.vylegzv.abstract_factory.plants.Liverwort;
import com.vylegzv.abstract_factory.plants.Moss;
import com.vylegzv.abstract_factory.plants.Plant;
import com.vylegzv.abstract_factory.rivers.OnyxRiver;
import com.vylegzv.abstract_factory.rivers.River;

/**
 * Antarctica continent concrete factory.
 * 
 * @author vella
 *
 */
public class AntarcticaContinentFactory implements ContinentFactory {

  @Override
  public Mountains createMountains() {
    return new TransantarcticMountains();
  }

  @Override
  public River createRiver() {
    return new OnyxRiver();
  }

  @Override
  public Plant[] createPlants() {
    Plant[] plants = {new Liverwort(), new Moss()};
    return plants;
  }

  @Override
  public Animal[] createAnimals() {
    Animal[] animals = {new Penguin(), new Seal(), new Whale()};
    return animals;
  }
}
