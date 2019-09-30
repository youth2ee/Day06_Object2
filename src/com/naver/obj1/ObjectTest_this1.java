package com.naver.obj1;

public class ObjectTest_this1 {
	
	public static void main(String[] args) {
		
	Member member = new Member();
	System.out.println(member.age); //Member()에서 초기화한 값
	System.out.println(member.name);//Member()에서 초기화한 값
	
	member.age = 29;
	member.name = "이가1";
	
	System.out.println(member.age);
	System.out.println(member.name);
	
	member.info(100); //info를 호출
	System.out.println(member); //member의 주소
	
	System.out.println("====================");
	

	Member member2 = new Member();
	member2.name = "이지윤";
	
	member2.info(100); //info를 호출
	System.out.println(member2); //member2의 주소
	
		
	}

}
