package com.naver.obj3;

public class CarInfo {
	//자동차의 모든 정보를 출력하는 메서드를 만들래
	//메서드 명 : carView
	
	public void carView(Car car) {
		System.out.println("Company : "+Car.company); //클래스변수 / 클래스명.변수명
		System.out.println("  Model : "+car.model); //멤버변수 
		System.out.println("  Color : "+car.color);
		System.out.println("     Hp : "+car.hp);
		System.out.println("================");
	}

}
