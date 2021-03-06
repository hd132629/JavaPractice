package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int busPrice = 850, carPrice = 300, etcPrice = 600, add = 0, price =0;
		
		String kind="고속버스";
		int distance=25;

		if(distance % 10 != 0){
			add = add + 1;
		}

		add = add + (distance / 10) - 1;
		
		switch (kind){
		case "고속버스":
			price = busPrice + (add * 300);
			break;
		case "경차":
			price = carPrice + (add * 200);
			break;
		default:
			price = etcPrice + (add * 200);
			kind = "그외";
		}
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + distance + "km");
		System.out.println("차종 : " + kind);
		System.out.println("통행료 : " + price + "원");
	}

}
