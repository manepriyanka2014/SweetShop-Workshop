package com.bridglabz.sweetshop;
import java.util.Objects;

public abstract class Sweet {

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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sweet sweet = (Sweet) obj;
		return id.equals(sweet.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}