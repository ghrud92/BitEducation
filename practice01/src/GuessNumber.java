import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int min, max;
		int round = 1;
		int input;
		int target;
		char regame;
		while(true){
			min = 1;
			max = 100;
			target = random.nextInt(99);
			target++;
			System.out.println("수를 결정하였습니다. 맞추어 보세요.");
			while(true){
				System.out.println(min + "-" + max);
				System.out.print(round + ">>");
				input = scan.nextInt();
				if(input>target){
					System.out.println("더 낮게");
					max = input;
				} else if(input<target){
					System.out.println("더 높게");
					min = input;
				} else
					break;
				round++;
			}
			System.out.println("맞았습니다.");
			System.out.print("다시하시겠습니까?(y/n)>>");
			regame = scan.next().charAt(0);
			if(regame=='n')
				break;
		}
		
		scan.close();
	}
}
