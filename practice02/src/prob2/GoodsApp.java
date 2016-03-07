package prob2;

import java.util.Scanner;

public class GoodsApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Goods[] goods = new Goods[3];
		int[] cost = new int[3];
		int[] count = new int[3];
		for(int i=0;i<3;i++)
			goods[i] = new Goods();
		String [] data = new String[9];
		for(int i=0;i<3;i++){
			data[i] = scanner.next();
			cost[i] = scanner.nextInt();
			count[i] = scanner.nextInt();
		}
		
		for(int i=0;i<3;i++){
			goods[i].setName(data[i]);
			goods[i].setCost(cost[i]);
			goods[i].setCount(count[i]);
		}
		
		for(int i=0;i<3;i++)
			goods[i].show();
		
	}
}
