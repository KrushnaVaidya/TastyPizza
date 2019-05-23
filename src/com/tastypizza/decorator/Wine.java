package com.tastypizza.decorator;

public class Wine extends Drinks {
	public Wine() {
		name="Lemonade";
		calories=607;
		price=7.49;
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
