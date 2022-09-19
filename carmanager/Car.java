package ua.com.foxminded.carmanager;


public class Car {

	String name;
	int yearOfProduction;
	int price;
	int weight;
	Color color;
	private int distance = 0;


	public Car(String name, int price, int yearOfProduction, int weight, String color) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = Color.valueOf(color.replace(" ", "").toUpperCase());
		
	}

	public void addPrice (int additionalPrice) {
		price += additionalPrice;
	}

	public void addDistance(int additionalDistance) {
		distance += additionalDistance;
	}
	
	public void addDistance(double additionalDistance) {
		distance +=additionalDistance;
	}

	public int getDistance() {
		return distance;
	}


	@Override
	public String toString() {
		return "Car [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight="
				+ weight + ", color=" + color.colorName + ", distance=" + distance + "]";
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + weight;
		result = prime * result + yearOfProduction;
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (color != other.color)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (weight != other.weight)
			return false;
		if (yearOfProduction != other.yearOfProduction)
			return false;
		return true;
	}
	
	
	
	
}
