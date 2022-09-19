package ua.com.foxminded.carmanager;

import java.awt.Color;

public class CarManeger {

	public static void main(String[] args) {

		Car prius = new Car("Toyota Prius", 15000, 2008, 1200, "Green");

		Car renault = new Car("Renault Laguna", 9700, 2000, 1600, "White");
		
		Car renault2 = new Car("Renault Laguna", 9700, 2000, 1600, "White");

		prius.addDistance(1000);
		prius.addDistance(2000);
		prius.addPrice(5000);
		prius.addDistance(11.9);
		
		System.out.println(prius);
		System.out.println(renault);
		
		System.out.println(prius.equals(renault2));
		System.out.println(renault.equals(renault2));
		
		
		
		Motorcycle suzuki = new Motorcycle("Suzuki GSX-R1000", 2021, 16000, 600, "black", "diesel", true);
		
		Motorcycle yamaha = new Motorcycle("Yamaha FZ1", 2007, 9000, 700, "orangE", "gas", false);
		
		yamaha.addDistance(250000);
		suzuki.addDistance(250000);
		suzuki.destroyEngine();
		yamaha.repair();
		suzuki.repair();
		yamaha.repaint("BLACK");
		suzuki.addDistance(11.5);
		yamaha.addDistance(-11.5);
		
		
		System.out.println(suzuki);
		System.out.println(yamaha);
		
		System.out.println(yamaha.equals(suzuki));
		
		
	}

}
