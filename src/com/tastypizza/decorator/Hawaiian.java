package com.tastypizza.decorator;

public class Hawaiian extends Pizza {

	 public Hawaiian() {
		desc="Hawaiin";
		price=6.49;
		calories=1024;
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
