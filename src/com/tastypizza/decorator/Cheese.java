package com.tastypizza.decorator;

public class Cheese extends Toppings {
	Pizza pizza;
	public Cheese(Pizza pizza) {
		this.pizza=pizza;
	}
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return pizza.getDesc()+" Cheese";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice()+0.69;
	}
	@Override
	public int getCalories() {
		return pizza.getCalories()+92;
	}

}
