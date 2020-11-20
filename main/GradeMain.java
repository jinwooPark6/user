package main;

import java.util.Scanner;

import grade.GradeDto;

public class GradeMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeDto grade = new GradeDto();
		while(true) {
			System.out.println("[메뉴] 0.종료 1.성적등록 2.등수발표(이름,합계,평균점수)");
	    switch (scanner.next()) {
		case "1":
			System.out.println("[성적 등록]");
			System.out.println("이름: ");
			grade.setName(scanner.next());
			System.out.println("국어 점수: ");
			grade.setKor(scanner.nextInt());
			System.out.println("영어 점수: ");
			grade.setEng(scanner.nextInt());
			System.out.println("수학 점수: ");
			grade.setMath(scanner.nextInt());
			break;
		
		case "2":
			System.out.println("[등수 발표]");
			
			
			break;
		case "0":
			System.out.println("시스템 종료");
			return;
			
		}		
		
		
		
	}
		//1등: a, 합계: 270, 평균: 90
		//2등: b, 합계: 240, 평균: 80
		//3등: c, 합계: 210, 평균: 70

		
	}

}
