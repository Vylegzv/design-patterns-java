package com.vylegzv.abstract_factory.continent;

import com.vylegzv.abstract_factory.animals.Animal;
import com.vylegzv.abstract_factory.animals.Armadillo;
import com.vylegzv.abstract_factory.animals.Capybara;
import com.vylegzv.abstract_factory.animals.Jaguar;
import com.vylegzv.abstract_factory.mountains.AndesMountains;
import com.vylegzv.abstract_factory.mountains.Mountains;
import com.vylegzv.abstract_factory.plants.Plant;
import com.vylegzv.abstract_factory.plants.RubberTree;
import com.vylegzv.abstract_factory.plants.SilkFlossTree;
import com.vylegzv.abstract_factory.rivers.AmazonRiver;
import com.vylegzv.abstract_factory.rivers.River;

/**
 * South America continent concrete factory.
 * 
 * @author vella
 *
 */
public class SouthAmericaContinentFactory implements ContinentFactory {

  @Override
  public Mountains createMountains() {
    return new AndesMountains();
  }

  @Override
  public River createRiver() {
    return new AmazonRiver();
  }

  @Override
  public Plant[] createPlants() {
    Plant[] plants = {new RubberTree(), new SilkFlossTree()};
    return plants;
  }

  @Override
  public Animal[] createAnimals() {
    Animal[] animals = {new Armadillo(), new Capybara(), new Jaguar()};
    return animals;
  }
}
