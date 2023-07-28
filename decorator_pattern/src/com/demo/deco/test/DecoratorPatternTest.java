package com.demo.deco.test;

import com.demo.deco.BasicCar;
import com.demo.deco.LuxaryCar;
import com.demo.deco.SportsCar;
import com.demo.deco.inter.Car;

public class DecoratorPatternTest {

	public static void main(String args[]) {
		
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("/n****************");
		
		Car superLuxaryCar = new SportsCar(new LuxaryCar(new BasicCar()));
		superLuxaryCar.assemble();
	}
	
}
