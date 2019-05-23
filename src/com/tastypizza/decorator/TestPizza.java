package com.tastypizza.decorator;

public class TestPizza {

	public static void main(String[] args) {
		Pizza pizza1=new Margherita();
		pizza1=new Ham(pizza1);
		pizza1=new Pineapple(pizza1);
		
		Drinks drink=new Wine();
		
		Franchise franchise=new TastyPizzaMug();
		double total=0;
		System.out.println("==============================[  BILL ]=============================");
		System.out.println(pizza1.getDesc()+" : "+pizza1.getPrice()+" : "+pizza1.getCalories());
		System.out.println(drink.name+" : "+drink.getPrice()+" : "+drink.getcalories());
		System.out.println(franchise.getName()+" : "+franchise.getPrice());
		total=pizza1.getPrice()+drink.getPrice()+franchise.getPrice();
		System.out.println("===========================Total="+total+" $ ===========================");

	}

}
