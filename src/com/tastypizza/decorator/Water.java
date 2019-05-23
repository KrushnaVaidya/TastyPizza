package com.tastypizza.decorator;

public class Water extends Drinks {
	public Water() {
		name="Lemonade";
		calories=0;
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
