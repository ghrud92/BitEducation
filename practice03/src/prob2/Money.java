package prob2;

public class Money {
	int total, fifty_thou, ten_thou, five_thou, one_thou, five_hund, one_hund, fifty, ten, one;
	
	public Money() {
		total = fifty_thou = ten_thou = five_thou = one_thou = five_hund = one_hund = fifty = ten = one = 0;
	}
	public Money(int input){
		if(input<0)
			total = fifty_thou = ten_thou = five_thou = one_thou = five_hund = one_hund = fifty = ten = one = 0;
		else{
			int temp = total = input;
			fifty_thou = temp/50000;
			temp %= 50000;
			ten_thou = temp/10000;
			temp %= 10000;
			five_thou = temp/5000;
			temp %= 5000;
			one_thou = temp/1000;
			temp %= 1000;
			five_hund = temp/500;
			temp %= 500;
			one_hund = temp/100;
			temp %= 100;
			fifty = temp/50;
			temp %= 50;
			ten = temp/10;
			temp %= 10;
			one = temp;
		}
	}
	
	public void show(){
		System.out.println("금액: "+total);
		System.out.println();
		System.out.println("오만 원권: "+fifty_thou+"매");
		System.out.println("만 원권: "+ten_thou+"매");
		System.out.println("오천 원권: "+five_thou+"매");
		System.out.println("천 원권: "+one_thou+"매");
		System.out.println("500원 동전: "+five_hund+"개");
		System.out.println("100원 동전: "+one_hund+"개");
		System.out.println("50원 동전: "+fifty+"개");
		System.out.println("10원 동전: "+ten+"개");
		System.out.println("1원 동전: "+one+"개");
		
	}
}
