package prob2;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
		/* 구현코드 */
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		Money money = new Money(input);
		money.show();
	}
}

