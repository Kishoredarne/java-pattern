package com.demo.deco;

import com.demo.deco.inter.Car;

public class SportsCar extends CarDecorator{

	public SportsCar(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}

	
	

	@Override
	public Car assemble() {
		// TODO Auto-generated method stub
		return addpattern(super.assemble());
	}




	private Car addpattern(Car assemble) {
		// TODO Auto-generated method stub
		return assemble;
	}

	

	

	
}
