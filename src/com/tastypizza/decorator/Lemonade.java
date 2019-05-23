package com.tastypizza.decorator;

public class Lemonade extends Drinks {
	public Lemonade() {
		name="Lemonade";
		calories=128;
		price=1.29;
	}
	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public int getcalories() {
		// TODO Auto-generated method stub
		return this.calories;
	}

}
