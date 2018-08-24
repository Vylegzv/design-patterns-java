package com.vylegzv.strategy;

/**
 * A strategy that adds an additional cost of a rear spoiler accessory to a
 * car's price.
 * 
 * @author vella
 *
 */
public class RearSpoilerCostAccessory implements CarAccessoryCostStrategy {

	private static final int accessoryCost = 400;

	@Override
	public int addAccessoryCost(int carPrice) {
		return carPrice + accessoryCost;
	}
}
