package org.dimigo.oop;

public class CarTest {
	public static void main(String[] args){

		Car3 car1 = new Car3("현대자동차", "제네시스", "검정색", 225, 50000000);
		Car3 car2 = new Car3("기아자동차", "K7", "흰색", 246);
		Car3 car3 = new Car3("삼성자동차", "SM7", "회색");

		/*
		Car2 car1 = new Car2("현대자동차", "제네시스", "검정색", 225, 50000000);
		Car2 car2 = new Car2("기아자동차", "K7", "흰색", 246, 40000000);
		Car2 car3 = new Car2("삼성자동차", "SM7", "회색", 200, 38000000);
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		car1.setCompany("현대자동차");
		car1.setModel("제네시스");
		car1.setColor("검정색");
		car1.setMaxSpeed(225);
		car1.setPrice(50000000);
		
		car2.setCompany("기아자동차");
		car2.setModel("K7");
		car2.setColor("흰색");
		car2.setMaxSpeed(246);
		car2.setPrice(40000000);
		
		car3.setCompany("삼성자동차");
		car3.setModel("SM7");
		car3.setColor("회색");
		car3.setMaxSpeed(200);
		car3.setPrice(38000000);
		*/
		System.out.println("<< 자동차 목록 >>");
		
		//Car car = null;
		
		Car3 car = null;
		
		for(int i=1;i<=3;i++) {
			if(i == 1)
				car = car1;
			else if(i == 2)
				car = car2;
			else if(i == 3)
				car = car3;
				
			System.out.println("제조사명 : " + car.getCompany());
			System.out.println("모델명 : " + car.getModel());
			System.out.println("색상 : " + car.getColor());
			System.out.println("최대속도 : " + car.getMaxSpeed() + "km");
			System.out.printf("가격 : %,d원\n\n", car.getPrice());
		}
	}

}