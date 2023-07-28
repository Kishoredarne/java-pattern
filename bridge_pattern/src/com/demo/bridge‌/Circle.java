package com.demo.bridge‌;

import com.demo.bridge‌.inte.Color;

public class Circle extends Shape {

	public Color color;
	public Circle(Color color) {
		//super(color);
		// TODO Auto-generated constructor stub
		this.color=color;
		
	}

	@Override
	public void draw() {
		System.out.println("Draw circle and "+color.fill());

	}

}
