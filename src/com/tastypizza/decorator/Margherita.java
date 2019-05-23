package com.tastypizza.decorator;

public class Margherita extends Pizza {

	public  Margherita() {
		
		desc="Margherita";
		price=4.99;
		calories=1104;
	}
	@Override
	public double getPrice() {
		
		return this.price;
	}
	@Override
	public int getCalories() {
		// TODO Auto-generated method stub
		return this.calories;
	}

}
