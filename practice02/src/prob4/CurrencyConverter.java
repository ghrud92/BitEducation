package prob4;

public class CurrencyConverter {

	private static double RATE = 0.;

	public static double toDollar(double won) {
		return won / RATE;
	}

	public static double toKWR(double dollar) {
		return dollar * RATE;
	}

	public static void setRate(double r) {
		RATE = r;	//RATE = (won/dollar)
	}

	public static void main(String[] args) { 
		setRate(1212.12121);	//3월 4일 현재 환
		System.out.println("백만원은 " + toDollar(1000000) + "달러입니다.");
		System.out.println("백달러는 " + toKWR(100) + "원입니다.");
	}
}
