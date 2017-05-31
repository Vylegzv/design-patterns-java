package com.vylegzv.builder;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * A car with several build options.
 * 
 * @author vella
 *
 */
public final class Car {

  private final Model type;
  private final Color color;
  private Package pack;
  private Set<Accessory> accessories = new HashSet<Accessory>();

  private Car(CarBuilder builder) {
    this.type = builder.type;
    this.color = builder.color;
    this.pack = builder.pack;
    this.accessories = builder.accessories;
  }

  public Model getType() {
    return type;
  }

  public Color getColor() {
    return color;
  }

  public Package getPack() {
    return pack;
  }

  public Set<Accessory> getAccessories() {
    return accessories;
  }

  @Override
  public String toString() {
    StringBuilder str = new StringBuilder();
    str.append(color).append(" ").append(type);
    if (pack != null) {
      str.append("\n-> with ");
      str.append(pack.getDescription());
    }
    if (accessories != null && accessories.size() > 0) {
      str.append("\n-> with the following accessories: ");
      str.append(accessories.stream().map(accessory -> accessory.toString())
          .collect(Collectors.joining(", ")));
    }
    return str.toString();
  }

  /**
   * The car builder.
   * 
   * @author vella
   *
   */
  public static class CarBuilder {

    private final Model type;
    private final Color color;
    private Package pack;
    private Set<Accessory> accessories = new HashSet<Accessory>();

    public CarBuilder(Model type, Color color) {
      this.type = type;
      this.color = color;
    }

    public CarBuilder withPackage(Package pack) {
      this.pack = pack;
      return this;
    }

    public CarBuilder withAccessory(Accessory accessory) {
      this.accessories.add(accessory);
      return this;
    }

    public Car build() {
      return new Car(this);
    }
  }
}
