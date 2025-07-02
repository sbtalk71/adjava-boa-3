package com.demo.calc;

import com.demo.Add;
import com.ex.Multiplier;

public class Calculator {

	public int add(int a, int b) {
		Add adder= new Add();
		return adder.doAdd(a, b);
	}
	
	public int productOf(int x, int y) {
		Multiplier m= new Multiplier();
		return m.multiply(x, y);
	}
}
