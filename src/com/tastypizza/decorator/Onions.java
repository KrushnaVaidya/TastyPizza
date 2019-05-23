package com.tastypizza.decorator;

public class Onions extends Toppings {
	Pizza pizza;
	public Onions(Pizza pizza) {
		// TODO Auto-generated constructor stub
		this.pizza=pizza;
	}
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return pizza.getDesc()+" Onions";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice()+0.69;
	}
	@Override
	public int getCalories() {
		return pizza.getCalories()+22;
	}

}
