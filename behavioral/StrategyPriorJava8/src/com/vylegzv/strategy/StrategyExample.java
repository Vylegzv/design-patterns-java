package com.vylegzv.strategy;

/**
 * The Strategy pattern is a behavioral design pattern that defines a family 
 * of algorithms, encapsulates each one, and makes them interchangeable. 
 * It lets the algorithm vary independently from clients that use it.
 * <p>
 * Advantages:
 * <ul>
 * <li>Prevents the use of conditional statements, helping readability and testability.
 * <li>Provides extensibility, allowing to easily extend new behaviors, including those defined by clients.
 * <li>Supports Open/Closed principle by allowing to extend a logic in some parts of the code without rewriting those parts.
 * <li>Loose-coupling of objects.
 * </ul>
 * <p>
 * Uses:
 * <ul>
 * <li>when the classes are related but their behaviors differ
 * <li>when a class contains multiple conditional statements to switch between different behaviors
 * <li>when different variations of the same algorithm are needed
 * <li>when the algorithm data and logic should be hidden from clients
 * </ul>
 * <p>
 * 
 * @author vella
 *
 */
public class StrategyExample {

	public static void main(String[] args) {
		CarPrice carPrice = new CarPrice(new AllWeatherFloorMatCostAccessory());
		System.out.println("Car cost with all weather floor mat: " + carPrice.getCarPriceWithAccessory(35000));
		
		carPrice.setCarAccessoryCost(new PaintProtectionFilmCostAccessory());
		System.out.println("Car cost with paint protction film: " + carPrice.getCarPriceWithAccessory(35000));
		
		carPrice.setCarAccessoryCost(new RearSpoilerCostAccessory());
		System.out.println("Car cost with rear spoiler: " + carPrice.getCarPriceWithAccessory(35000));
		
		carPrice.setCarAccessoryCost(new SideMoldingsCostAccessory());
		System.out.println("Car cost with side moldings: " + carPrice.getCarPriceWithAccessory(35000));
	}
}
