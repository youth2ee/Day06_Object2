package com.naver.obj1;

public class Calculator {

	//메서드 오버로딩 (overloading)
	// : 똑같은 메서드를 여러개 만든다. new의 개념. 
	// : 비슷한 일을 하는 같은 이름의 메서드를 여러개 만드는 것
	// : 성립조건 - 메서드의 이름이 같아야 하고, 매개변수의 개수나 데이터타입의 구성이 달라야 한다.
	// 접근지정자나 리턴타입은 상관이 없다.


	public void hap(int num1, int num2) {
		System.out.println(num1+num2);
	}//hap1

	public void hap(int num1, float num2) {
		System.out.println(num1+num2);
	}//hap2

	public void hap(float num1, float num2) {
		System.out.println(num1+num2);
	}//hap3

	public double hap(double num1, double num2) {
		System.out.println(num1+num2);
		return num1+num2;
	}//hap4



}
