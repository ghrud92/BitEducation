package prob2;

public class Goods {
	private String name;
	private int cost;
	private int count;
	
	public Goods(){
		
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setCost(int cost){
		this.cost = cost;
	}
	
	public void setCount(int count){
		this.count = count;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getCost(){
		return this.cost;
	}
	
	public int getCount(){
		return this.count;
	}
}
