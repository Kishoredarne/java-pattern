package com.demo.deco;

import com.demo.deco.inter.Car;

public class CarDecorator implements Car{
	
	protected Car car;
	

	public CarDecorator(Car car) {
		this.car = car;
	}


	@Override
	public Car assemble() {
		return this.car.assemble();
	}

}
