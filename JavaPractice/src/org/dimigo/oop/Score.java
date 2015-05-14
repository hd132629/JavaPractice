package org.dimigo.oop;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		System.out.printf("수학 점수 입력 => ");
		int mat = scanner.nextInt();
		System.out.printf("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		
		StringBuilder sb = new StringBuilder()
			.append("\n<< 점수 출력 >>")
			.append("\n국어 점수 : ")
			.append(kor)
			.append(" 점\n수학 점수 : ")
			.append(mat)
			.append(" 점\n영어 점수 : ")
			.append(eng)
			.append(" 점\n총점 : ")
			.append(kor + mat + eng)
			.append(" 점\n평균 : ")
			.append(String.format("%.1f", (kor + mat + eng) / 3.0))
			.append(" 점");
		System.out.println(sb);
		
		scanner.close();
	}
}
