package prob3;

public class Account {
	private String accountNumber;
	private int balance;
	
	public Account(String accountNumber){
		this.accountNumber = accountNumber;
		this.balance = 0;
		System.out.println(this.accountNumber + " 계좌가 개설되었습니다.");
	}
	
	public Account(){
		
	}
	
	public void setAccountNumber(String accountNumber){
		this.accountNumber = accountNumber;
	}
	
	public void setBalance(int balance){
		this.balance = balance;
	}
	
	public String getAccountNo(){
		return this.accountNumber;
	}
	
	public int getBalance(){
		return this.balance;
	}
	
	public void save(int money){
		this.balance += money;
		System.out.println();	//main메소드를 수정하지 않고 엔터를 치는 방법 
		System.out.println(this.accountNumber + " 계좌에 " + money + "만원이 입금되었습니다.");
	}
	
	//deposit은 입금하다 아닌가 
	public void deposit(int money){
		this.balance -= money;
		System.out.println();	//main메소드를 수정하지 않고 엔터를 치는 방법 
		System.out.println(this.accountNumber + " 계좌에 " + money + "만원이 출금되었습니다.");
	}
}
