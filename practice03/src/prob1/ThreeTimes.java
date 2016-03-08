package prob1;

public class ThreeTimes {
	private int[] arr;
	
	public ThreeTimes(int[] num){
		arr = new int[num.length];
		for(int i=0;i<arr.length;i++)
			arr[i] = num[i];
	}
	
	public ThreeTimes() {}
	
	public void show(){
		int number = 0;
		int total = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%3 == 0){
				number++;
				total += arr[i];
			}
		}
		System.out.println("주어진 배열에서 3의 배수의 개수=>" + number);
		System.out.println("주어진 배열에서 3의 배수의 합=>" + total);
	}
}
