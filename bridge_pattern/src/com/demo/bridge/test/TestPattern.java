package com.demo.bridge.test;

import com.demo.bridge‌.BlueColor;
import com.demo.bridge‌.Circle;
import com.demo.bridge‌.Red;
import com.demo.bridge‌.Shape;
import com.demo.bridge‌.Triagle;

public class TestPattern {

	public static void main(String args[]) {
		System.out.println("Bridge Pattern");
		
		Shape triShape = new Triagle(new BlueColor());
		triShape.draw();
		
		Shape cirShape = new Circle(new Red());
		cirShape.draw();
		
	}
}
