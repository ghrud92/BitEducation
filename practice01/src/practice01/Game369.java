package practice01;


public class Game369 {
	public static void main(String[] args) {
		String result;
		Boolean check = false;
		int num;
		for(int i=1;i<100;i++){
			num = i;
			result = "";
			while(num!=0){
				if(num%10==3 || num%10==6 || num%10==9){
					result += "짝";
					check = true;
				}
				num /= 10;
			}
			if(check){
				System.out.println(i+" "+result);
				check = false;
			}
		}
	}
}
