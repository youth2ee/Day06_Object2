package com.naver.obj1;

public class Member {
	
	public Member() { //클래스명과 동일한 이름의 메서드명 가진다.
		System.out.println("Member 객체 생성");
		this.age =28;
		this.name="이가영";
		this.info(31);
	}//default 생성자, 기본 생성자, 빈 생성자 (매개변수가 없는 생성자)
	
	
	int age; //멤버변수 //회원의 나이
	String name; //회원의 이름
	
	public void info(int age) { //지역변수
		//회원의 정보를 출력
		//위의 int age와 info의 int age는 다르다.
		//위의 int age는 멤버변수 이를 이용하기 위해서는 this.age라고 써주면 된다.
		System.out.println(age); // 지역변수
		System.out.println(this.age); //멤버변수
		System.out.println(this.name); 
		System.out.println(this);
		//this : 자기 자신의 객체 주소를 담고 있다. 내부에서만 자동 생성되는 참조변수. this는 생략가능
		//멤버메서드 안에서만 사용가능하다. 외부에서는 사용불가
		this.info2(); 
		//같은 클래스 내에서 다른 멤버메서드를 호출할 수 있다.
	}//info
	
	
	public void info2() {
		System.out.println("info2 Method");
		// this.info(10); 서로의 메서드를 불러주면 무한반복되므로 오류
	}//info2
	

}
