package com.tastypizza.decorator;

public class TastyPizzaMug extends Franchise{
	public TastyPizzaMug() {
		name="TastyPizza Mug";
		price=4.99;
	}
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

}
