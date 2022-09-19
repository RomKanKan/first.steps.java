package ua.com.foxminded.carmanager;

public class Motorcycle {

	String name;
	int yearOfProduction;
	int price;
	int weight;
	Color color;
	String engineType;
	boolean isReadyToDrive;
	private int distance = 0;
	
	
	public Motorcycle(String name, int yearOfProduction, int price, int weight, String color, String engineType,
			boolean isReadyToDrive) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = Color.valueOf(color.replace(" ", "").toUpperCase());
		this.engineType = engineType;
		this.isReadyToDrive = isReadyToDrive;
	}


	@Override
	public String toString() {
		return "Motorcycle [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight="
				+ weight + ", color=" + color.colorName + ", engineType=" + engineType + ", isReadyToDrive=" + isReadyToDrive + 
				", distance=" + distance + "]";
	}

	
	
	public void addDistance(int additionalDistance) {
		distance += additionalDistance; 
	}
	
	public void addDistance(double additionalDistance) {
		distance += Math.round(additionalDistance); 
	}

	
	public int getDistance() {
		return distance;
	}


	public void destroyEngine() {
		if (distance > 200000) {
			isReadyToDrive = false;
		} else {
			isReadyToDrive = true;
		}
		
	}

	public void repair () {
		isReadyToDrive = true;
	}
	
	public void repaint (String repaintColor) {
		color = Color.valueOf(repaintColor);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + distance;
		result = prime * result + (isReadyToDrive ? 1231 : 1237);
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
		Motorcycle other = (Motorcycle) obj;
		if (color != other.color)
			return false;
		if (distance != other.distance)
			return false;
		if (isReadyToDrive != other.isReadyToDrive)
			return false;
		return true;
	}
	
	
	
	
}
