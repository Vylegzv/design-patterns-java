package com.vylegzv.abstract_factory.continent;

import com.vylegzv.abstract_factory.animals.Animal;
import com.vylegzv.abstract_factory.animals.Dingo;
import com.vylegzv.abstract_factory.animals.Kangaroo;
import com.vylegzv.abstract_factory.animals.Koala;
import com.vylegzv.abstract_factory.mountains.GreatDividingRangeMountains;
import com.vylegzv.abstract_factory.mountains.Mountains;
import com.vylegzv.abstract_factory.plants.Acacia;
import com.vylegzv.abstract_factory.plants.Eucalyptus;
import com.vylegzv.abstract_factory.plants.Plant;
import com.vylegzv.abstract_factory.rivers.MurrayRiver;
import com.vylegzv.abstract_factory.rivers.River;

/**
 * Australia continent concrete factory.
 * 
 * @author vella
 *
 */
public class AustraliaContinentFactory implements ContinentFactory {

  @Override
  public Mountains createMountains() {
    return new GreatDividingRangeMountains();
  }

  @Override
  public River createRiver() {
    return new MurrayRiver();
  }

  @Override
  public Plant[] createPlants() {
    Plant[] plants = {new Acacia(), new Eucalyptus()};
    return plants;
  }

  @Override
  public Animal[] createAnimals() {
    Animal[] animals = {new Dingo(), new Kangaroo(), new Koala()};
    return animals;
  }
}
