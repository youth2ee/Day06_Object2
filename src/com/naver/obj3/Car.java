package com.naver.obj3;

public class Car {
	//제조사
	//모델
	//색
	//연료
	static String company = "Kia"; //클래스변수
	String model;
	String color;
	int hp;
	
	Wheel wheel;
	

	//생성자 overloading (매개변수를 다르게 해야함)
	
	public Car() { //default 생성자
		/*
		this.company="Kia";
		this.model="K7";
		this.color="Black";
		this.hp=200;
		*/
	
		//다른 메서드 호출 가능
		this("Black"); 
		//생성자들 중에서 매개변수 하나인 애를 호출
		//생성자 내에서 맨 첫줄에 위치 해야한다.
		
	} //car1
	
	public Car(String color) { //매개변수 오기때문에 default 생성자 아님.
		/*
		this.company="Kia";
		this.model="K7";
		
		this.color=color; //메인에서 내가 지정할 수 있게 됨
		//this를 안쓰면 color를 지역변수로만 인식하게 됨. 
		//color=color; 이렇게 하면 메인에서 멤버변수를 초기화하지 않은 null값으로만 인식
		//this를 써야 멤버변수로 인식한다. 
		
		this.hp=200;
		*/
		this(color,200);
	} //car2
	
	public Car(String color, int hp) {
		/*
		this.company="Kia";
		this.model="K7";
		this.color=color;
		this.hp=hp;
		*/
		this("K7", color, hp);
	} //car3
	
	public Car(String model, String color, int hp) {
		
		this.model=model;
		this.color=color;
		this.hp=hp;
		
		this.wheel= new Wheel();
	
	} //car4
	
} //Car
