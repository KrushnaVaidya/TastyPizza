package com.tastypizza.decorator;

public class Pineapple extends Toppings {
	Pizza pizza;
	public Pineapple(Pizza pizza) {
		// TODO Auto-generated constructor stub
		this.pizza=pizza;
	}
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return pizza.getDesc()+" Pineapple";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice()+0.79;
	}
	@Override
	public int getCalories() {
		return pizza.getCalories()+24;
	}

}
