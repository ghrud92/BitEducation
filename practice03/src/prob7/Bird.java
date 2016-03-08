package prob7;

public abstract class Bird {
	String name;
	int legs;
	int length;
	
	public void setName(String name){
		this.name = name;
	}
	
	public abstract void fly();
	public abstract void sing();
	public abstract String toString();
}
