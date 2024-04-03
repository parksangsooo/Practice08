package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) { // 무한 루프로 변경하여 여러 계산을 수행할 수 있게 함
//			System.out.println("계산식을 입력하세요 (예: 5 + 3), 종료하려면 /q");
			System.out.print(">> ");
			String input = scanner.nextLine();

			// 종료 조건 검사
			if ("/q".equals(input)) {
				System.out.println("프로그램을 종료합니다.");
				break; // 반복문을 빠져나옴으로써 프로그램 종료
			}

			String[] parts = input.split(" ");
			// 입력값 검증
			if (parts.length != 3) {
				System.out.println("잘못된 형식의 입력입니다. 다시 입력해주세요.");
				continue; // 다음 반복으로 넘어감
			}

			int a = Integer.parseInt(parts[0]);
			String operator = parts[1];
			int b = Integer.parseInt(parts[2]);
			int result = 0;

			switch (operator) {
			case "+":
				Add add = new Add();
				add.setValue(a, b);
				result = add.calculate();
				break;
			case "-":
				Sub sub = new Sub();
				sub.setValue(a, b);
				result = sub.calculate();
				break;
			case "*":
				Mul mul = new Mul();
				mul.setValue(a, b);
				result = mul.calculate();
				break;
			case "/":
				Div div = new Div();
				div.setValue(a, b);
				result = div.calculate();
				break;
			default:
				System.out.println("지원하지 않는 연산자입니다. 다시 입력해주세요.");
				continue; // 다음 반복으로 넘어감
			}

			System.out.println(">> " + result);
		}

		scanner.close();
	}
}