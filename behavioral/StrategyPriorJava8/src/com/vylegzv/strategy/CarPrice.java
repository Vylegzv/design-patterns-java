package com.vylegzv.strategy;

/**
 * A car price class that adds different accessory costs to a car price.
 * 
 * @author vella
 *
 */
public class CarPrice {

	private CarAccessoryCostStrategy carAccessoryCost;

	public CarPrice(CarAccessoryCostStrategy carAccessoryCost) {
		this.carAccessoryCost = carAccessoryCost;
	}

	public void setCarAccessoryCost(CarAccessoryCostStrategy carAccessoryCost) {
		this.carAccessoryCost = carAccessoryCost;
	}

	public int getCarPriceWithAccessory(int carPrice) {
		return carAccessoryCost.addAccessoryCost(carPrice);
	}
}
