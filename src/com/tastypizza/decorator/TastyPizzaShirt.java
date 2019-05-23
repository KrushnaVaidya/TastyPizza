package com.tastypizza.decorator;

public class TastyPizzaShirt extends Franchise{
	public TastyPizzaShirt() {
		
		name="TastyPizza Shirt";
		price=21.99;
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
