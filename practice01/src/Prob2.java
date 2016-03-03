

public class Prob2 {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int i=0;i<8;i++){
			for(int j=0;j<10;j++){
				System.out.print(arr[j]);
				arr[j]++;
				if(j<9)
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}

}
