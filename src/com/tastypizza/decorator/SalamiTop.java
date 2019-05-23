package com.tastypizza.decorator;

public class SalamiTop extends Toppings {
	Pizza pizza;
	public SalamiTop(Pizza pizza) {
		// TODO Auto-generated constructor stub
		this.pizza=pizza;
	}
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return pizza.getDesc()+" Salami";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice()+0.99;
	}
	@Override
	public int getCalories() {
		return pizza.getCalories()+86;
	}

}
