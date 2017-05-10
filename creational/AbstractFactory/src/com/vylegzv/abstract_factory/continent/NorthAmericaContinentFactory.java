package com.vylegzv.abstract_factory.continent;

import com.vylegzv.abstract_factory.animals.Animal;
import com.vylegzv.abstract_factory.animals.Bison;
import com.vylegzv.abstract_factory.animals.Coyote;
import com.vylegzv.abstract_factory.animals.Raccoon;
import com.vylegzv.abstract_factory.animals.Skunk;
import com.vylegzv.abstract_factory.mountains.Mountains;
import com.vylegzv.abstract_factory.mountains.RockyMountains;
import com.vylegzv.abstract_factory.plants.Magnolia;
import com.vylegzv.abstract_factory.plants.Plant;
import com.vylegzv.abstract_factory.plants.RedMaple;
import com.vylegzv.abstract_factory.plants.Sequoia;
import com.vylegzv.abstract_factory.rivers.MississippiRiver;
import com.vylegzv.abstract_factory.rivers.River;

/**
 * North America continent concrete factory.
 * 
 * @author vella
 *
 */
public class NorthAmericaContinentFactory implements ContinentFactory {

  @Override
  public Mountains createMountains() {
    return new RockyMountains();
  }

  @Override
  public River createRiver() {
    return new MississippiRiver();
  }

  @Override
  public Plant[] createPlants() {
    Plant[] plants = {new RedMaple(), new Magnolia(), new Sequoia()};
    return plants;
  }

  @Override
  public Animal[] createAnimals() {
    Animal[] animals = {new Bison(), new Coyote(), new Raccoon(), new Skunk()};
    return animals;
  }
}
