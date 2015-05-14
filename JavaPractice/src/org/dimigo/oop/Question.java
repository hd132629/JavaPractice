package org.dimigo.oop;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가장 좋아하는 가수는?");
		String answer1 = scanner.nextLine();
		if("케이윌".equals(answer1))
			System.out.println("정답입니다.");
		else
			System.out.println("틀렸습니다.");
		
		System.out.println("가장 좋아하는 배우는?");
		String answer2 = scanner.nextLine();
		if("신세경".equals(answer2))
			System.out.println("정답입니다.");
		else
			System.out.println("틀렸습니다.");
		
		System.out.println("가장 좋아하는 음식은?");
		String answer3 = scanner.nextLine();
		if("치킨".equals(answer3))
			System.out.println("정답입니다.");
		else
			System.out.println("틀렸습니다.");
		
		scanner.close();
	}

}
