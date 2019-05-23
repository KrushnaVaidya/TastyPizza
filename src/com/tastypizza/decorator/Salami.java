package com.tastypizza.decorator;

public class Salami extends Pizza{
	public Salami() {
		desc="Salami";
		price=5.99;
		calories=1160;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public int getCalories() {
		// TODO Auto-generated method stub
		return this.calories;
	}
}
