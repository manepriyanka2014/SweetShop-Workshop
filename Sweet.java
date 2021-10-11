package com.bridglabz.sweetshop;

public class Sweet {

	enum Color {
		RED, GREEN, WHITE, GREEN_WHITE; // constant
	}

	enum Category {
		MILK, SUGERLESS, GHEE, BEGALISWEET;
	}

	Color color;
	String id;
	int price;
	String name;
	Category category;

	@Override
	public String toString() {
		return "Sweet [color=" + color + "," + " id=" + id + ", price=" + price + "," + " name=" + name + "]";
	}

}
