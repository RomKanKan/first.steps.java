package ua.com.foxminded.carmanager;


public class Car {

	String name;
	int yearOfProduction;
	int price;
	int weight;
	Color color;


	public Car(String name, int yearOfProduction, int price, int weight, String color) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = Color.valueOf(color.replace(" ", "").toUpperCase());
		
	}




	@Override
	public String toString() {
		return "Car [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight="
				+ weight + ", color=" + color.colorName + "]";
	}
	
	
	
	
}
