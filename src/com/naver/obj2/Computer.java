package com.naver.obj2;

public class Computer {

	 String cpu ="amd";
	 int ssd=512;
	 
	 public Computer() { //default 생성자
		 //멤버변수의 초기값을 여기서 입력하자
		 //cpu = "i7";
		// ssd = 256;
	 }
	 
	 public void info() {
		 System.out.println("cpu"+this.cpu);
		 System.out.println("ssd"+this.ssd);
	 }
	 
	 
	
}
