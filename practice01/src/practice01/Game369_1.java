package practice01;

public class Game369_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		game(1);
	}
	
	public static void game(int n){
		if(n<100){
			int temp = n;
			int count = 0;
			do{
				if(temp%10==3 || temp%10==6 || temp%10==9){
					count++;
				}
				temp /= 10;
			}while(temp != 0);
			if(count != 0){
				System.out.print(n + " ");
				for(int i=0;i<count;i++)
					System.out.print("짝");
				System.out.println();
			}
			game(++n);
		}
	}

}
