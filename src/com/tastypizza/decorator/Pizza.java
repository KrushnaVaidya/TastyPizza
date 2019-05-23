package com.tastypizza.decorator;

public abstract class Pizza {
	 String desc;
	 double price;
	 int calories;
	 
	 public String getDesc() {
		 return desc;
	 }
	 public abstract double getPrice();
	 public abstract int getCalories();
	
}
