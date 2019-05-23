package com.tastypizza.decorator;

public class Ham  extends Toppings{
	Pizza pizza;
	public Ham(Pizza pizza) {
		// TODO Auto-generated constructor stub
		this.pizza=pizza;
	}
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return pizza.getDesc()+" Ham";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice()+0.99;
	}
	@Override
	public int getCalories() {
		// TODO Auto-generated method stub
		return pizza.getCalories()+35;
	}

}
