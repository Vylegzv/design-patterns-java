package com.vylegzv.abstract_factory.continent;

import com.vylegzv.abstract_factory.animals.Animal;
import com.vylegzv.abstract_factory.animals.BengalTiger;
import com.vylegzv.abstract_factory.animals.Orangutan;
import com.vylegzv.abstract_factory.animals.Panda;
import com.vylegzv.abstract_factory.mountains.HimalayasMountains;
import com.vylegzv.abstract_factory.mountains.Mountains;
import com.vylegzv.abstract_factory.plants.Bamboo;
import com.vylegzv.abstract_factory.plants.BanyanTree;
import com.vylegzv.abstract_factory.plants.Plant;
import com.vylegzv.abstract_factory.rivers.River;
import com.vylegzv.abstract_factory.rivers.YangtzeRiver;

/**
 * Asia continent concrete factory.
 * 
 * @author vella
 *
 */
public class AsiaContinentFactory implements ContinentFactory {

  @Override
  public Mountains createMountains() {
    return new HimalayasMountains();
  }

  @Override
  public River createRiver() {
    return new YangtzeRiver();
  }

  @Override
  public Plant[] createPlants() {
    Plant[] plants = {new Bamboo(), new BanyanTree()};
    return plants;
  }

  @Override
  public Animal[] createAnimals() {
    Animal[] animals = {new BengalTiger(), new Orangutan(), new Panda()};
    return animals;
  }
}
