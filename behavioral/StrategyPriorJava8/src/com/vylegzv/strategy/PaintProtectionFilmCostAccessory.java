package com.vylegzv.strategy;

/**
 * A strategy that adds an additional cost of a paint protection film accessory
 * to a car's price.
 * 
 * @author vella
 *
 */
public class PaintProtectionFilmCostAccessory implements CarAccessoryCostStrategy {

	private static final int accessoryCost = 500;

	@Override
	public int addAccessoryCost(int carPrice) {
		return carPrice + accessoryCost;
	}
}
