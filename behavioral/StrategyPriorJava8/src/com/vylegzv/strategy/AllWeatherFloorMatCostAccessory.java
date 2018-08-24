package com.vylegzv.strategy;

/**
 * A strategy that adds an additional cost of all weather floor mats accessory
 * to a car's price.
 * 
 * @author vella
 *
 */
public class AllWeatherFloorMatCostAccessory implements CarAccessoryCostStrategy {

	private static final int accessoryCost = 100;

	@Override
	public int addAccessoryCost(int carPrice) {
		return carPrice + accessoryCost;
	}
}
