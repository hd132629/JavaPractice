package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		int a = 9, b = 10 ;
		double h = 5.8, size1, size2;
		
		size1 = (a + b) * h / 2;
		h=5.4;
		size2 = a * h;
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.printf("사다리꼴 넓이 : %.1f\n", size1);
		System.out.printf("평행사변형 넓이 : %.1f\n\n", size2);
		
		if(size1 > size2)
			System.out.printf("사다리꼴이 평행사변형 보다 %.1f 더 큽니다.", size1 - size2);
		else if(size2 > size2)
			System.out.printf("평행사변형이 사다리꼴 보다 %.1f 더 큽니다.", size2 - size1);
	}

}
