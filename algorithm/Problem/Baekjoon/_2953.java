package Problem;


import java.util.Scanner;

public class _2953 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int [5][4];
		int [] sum = new int[5];
		int max,idx = 0;
		for (int i = 0; i<5; i++) {
			for(int j = 0; j<4; j++)
				arr[i][j]  = scan.nextInt();
		}
		for (int i = 0; i<5; i++) {
			for(int j = 0; j<4; j++)
				sum[i] = sum[i] + arr[i][j];
		}
		max = sum[0];
		for (int i = 0; i<5; i++) {
			if(max<sum[i]) {
				max = sum[i];
				idx = i;
			}
		}
		System.out.println((idx+1)+" "+max);
	}

}
