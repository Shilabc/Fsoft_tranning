package com.vn;

import com.vn.controler.Caculator;

public class Main {
	public static void main(String[] args) {

		Caculator caculator1 = new Caculator();
		caculator1.setA(6);
		caculator1.setB(5);
		caculator1.setC("+");
		float result1 = caculator1.caculator();
		System.out.println(result1);

		Caculator caculator2 = new Caculator();
		caculator2.setA(10);
		caculator2.setB(5);
		caculator2.setC("-");
		float result2 = caculator2.caculator();
		System.out.println(result2);

		Caculator caculator3 = new Caculator();
		caculator3.setA(5);
		caculator3.setB(5);
		caculator3.setC("*");
		float result3 = caculator3.caculator();
		System.out.println(result3);

		Caculator caculator4 = new Caculator();
		caculator4.setA(20);
		caculator4.setB(6);
		caculator4.setC("/");
		float result4 = caculator4.caculator();
		System.out.println(result4);
		
		}
		
	}

