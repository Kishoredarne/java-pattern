package com.demo.deco;

import com.demo.deco.inter.Car;

public class LuxaryCar extends CarDecorator{

	public LuxaryCar(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Car assemble() {
		// TODO Auto-generated method stub
	    Car c = addPattern(super.assemble());
		return c;
	}

	private Car addPattern(Car c) {
		
		return c;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//these are the methods can override of object
	//@Override
	/*public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}*/

	
}
