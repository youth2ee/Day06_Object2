package com.naver.obj3;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		CarInfo carinfo = new CarInfo();
		Car car = new Car();
		Car car2 = new Car("Red");
		Car car3 = new Car("Yellow", 3000);
		Car car4 = new Car("K5", "Blue", 1000);
		
		Car.company="Samsung"; //일괄적으로 바꾸자
		
		//Car car(); 불가
		
		carinfo.carView(car);
		carinfo.carView(car2);
		carinfo.carView(car3);
		carinfo.carView(car4);
	}
}
