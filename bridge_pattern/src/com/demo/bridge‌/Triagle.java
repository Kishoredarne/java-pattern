package com.demo.bridge‌;

import com.demo.bridge‌.inte.Color;

public class Triagle extends Shape{

	public Color color;
	public Triagle(Color color) {
		//super(color);
		// TODO Auto-generated constructor stub
		this.color = color;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw triangle and "+color.fill()+" ...... ");
		
	}

	

}
