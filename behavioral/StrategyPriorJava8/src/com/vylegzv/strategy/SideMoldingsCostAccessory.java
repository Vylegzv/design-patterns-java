package com.vylegzv.strategy;

/**
 * A strategy that adds an additional cost of side moldings accessory
 * to a car's price.
 * 
 * @author vella
 *
 */
public class SideMoldingsCostAccessory implements CarAccessoryCostStrategy {

	private static final int accessoryCost = 200;

	@Override
	public int addAccessoryCost(int carPrice) {
		return carPrice + accessoryCost;
	}
}
