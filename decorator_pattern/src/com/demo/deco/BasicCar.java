package com.demo.deco;

import com.demo.deco.inter.Car;

public class BasicCar implements Car{

	@Override
	public Car assemble() {
		// TODO Auto-generated method stub
		
		return new BasicCar();
		
	}
	
	

}
