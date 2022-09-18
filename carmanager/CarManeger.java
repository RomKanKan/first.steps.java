package ua.com.foxminded.carmanager;

import java.awt.Color;

public class CarManeger {

	public static void main(String[] args) {

		Car prius = new Car("Toyota Prius", 15000, 2008, 1200, "Green");

		Car renault = new Car("Renault Laguna", 9700, 2000, 1600, "White");

		Motorcycle suzuki = new Motorcycle("Suzuki GSX-R1000", 2021, 16000, 600, "black", "diesel", true);
		
		Motorcycle yamaha = new Motorcycle("Yamaha FZ1", 2007, 9000, 700, "orangE", "gas", false);
		
		System.out.println(prius);
		System.out.println(renault);
		System.out.println(suzuki);
		System.out.println(yamaha);
		
		
	}

}
