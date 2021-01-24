package Problem;

import java.util.Scanner;

public class _2847 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] arr = new int[n];
		int score = 0;
		for (int i = 0; i<n; i++)
			arr[i] = scan.nextInt();
		int max = arr[n-1];
		int i = n-2; 
		while(true) {
			if(max<=arr[i]) {
				score++;
				arr[i]--;
				continue;
			}
			else {
				max = arr[i];
				i--;
			}
			if(i < 0)
				break;
			
		}
		System.out.println(score);
	}

}
