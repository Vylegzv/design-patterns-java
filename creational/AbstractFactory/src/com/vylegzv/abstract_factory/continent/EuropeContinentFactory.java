package com.vylegzv.abstract_factory.continent;

import com.vylegzv.abstract_factory.animals.Animal;
import com.vylegzv.abstract_factory.animals.GrayWolf;
import com.vylegzv.abstract_factory.animals.Reindeer;
import com.vylegzv.abstract_factory.animals.WildBoar;
import com.vylegzv.abstract_factory.mountains.AlpsMountains;
import com.vylegzv.abstract_factory.mountains.Mountains;
import com.vylegzv.abstract_factory.plants.EuropeanAshTree;
import com.vylegzv.abstract_factory.plants.EuropeanLarchTree;
import com.vylegzv.abstract_factory.plants.Plant;
import com.vylegzv.abstract_factory.plants.SilverBirch;
import com.vylegzv.abstract_factory.rivers.River;
import com.vylegzv.abstract_factory.rivers.VolgaRiver;

/**
 * Europe continent conrete factory.
 * 
 * @author vella
 *
 */
public class EuropeContinentFactory implements ContinentFactory {

  @Override
  public Mountains createMountains() {
    return new AlpsMountains();
  }

  @Override
  public River createRiver() {
    return new VolgaRiver();
  }

  @Override
  public Plant[] createPlants() {
    Plant[] plants =
        {new EuropeanAshTree(), new EuropeanLarchTree(), new SilverBirch()};
    return plants;
  }

  @Override
  public Animal[] createAnimals() {
    Animal[] animals = {new GrayWolf(), new Reindeer(), new WildBoar()};
    return animals;
  }
}
