package prob5;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		int a, b, result;
		String sign;
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		Scanner scanner = new Scanner(System.in);
		System.out.println("실행결과:");
		System.out.print(">> ");
		do
		{
			result = 0;
			a = scanner.nextInt();
			sign = scanner.next();
			b = scanner.nextInt();
			if(sign.equals("+")){
				add.setValue(a, b);
				result = add.calculate();
			}else if(sign.equals("-")){
				sub.setValue(a, b);
				result = sub.calculate();
			}else if(sign.equals("*")){
				mul.setValue(a, b);
				result = mul.calculate();
			}else if(sign.equals("/")){
				div.setValue(a, b);
				result = div.calculate();
			}
			System.out.println(">> " + result);
			System.out.print(">> ");
		}while(scanner.hasNextInt());
	}

	static class Add {
		private int a;
		private int b;
		
		public void setValue(int a, int b){
			this.a = a;
			this.b = b;
		}
		
		public int calculate(){
			return a + b;
		}
	}
	
	static class Sub {
		private int a;
		private int b;
		
		public void setValue(int a, int b){
			this.a = a;
			this.b = b;
		}
		
		public int calculate(){
			return a - b;
		}
	}

	static class Mul {
		private int a;
		private int b;
		
		public void setValue(int a, int b){
			this.a = a;
			this.b = b;
		}
		
		public int calculate(){
			return a * b;
		}
	}

	static class Div {
		private int a;
		private int b;
		
		public void setValue(int a, int b){
			this.a = a;
			this.b = b;
		}
		
		public int calculate(){
			return a / b;
		}
	}
}
