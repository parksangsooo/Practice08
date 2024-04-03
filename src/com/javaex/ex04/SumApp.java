package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		//코드를 작성하세요
		String[] numbers = numLine.split(" ");		// 스트링으로 입력받은 숫자들을 공백으로 분리
		
		for(String numStr : numbers) {		// 분리된 문자열을 숫자로 변환하여 합을 구함
			sum = sum + Integer.parseInt(numStr.trim());	// 공백 제거 후 정수로 변환
		}		
		
		System.out.println("합:" + sum);
		
		sc.close();
	}

}
