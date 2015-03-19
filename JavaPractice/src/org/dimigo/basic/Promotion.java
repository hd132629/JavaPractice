package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		int salary = 1700000, member = 3, store = 1500;
		
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : " + String.format("%,d", salary) + "원");
		System.out.println("점포 내 직원 수 : " + String.format("%,d", member) + "명");
		System.out.println("점포 수 : " + String.format("%,d", store) + "개");
		
		long total;
		
		total = (long)salary * 12 * member * store;
		
		System.out.println("연간 인건비 : " + String.format("%,d", total) +"원");
	}

}
