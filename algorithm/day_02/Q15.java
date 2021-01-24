package day_02;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n;
		do {
		System.out.print("단 입력 : ");
		n = scan.nextInt();
		} while (n<=0);
		
		triangleLb(n);
		
		
	}

	static void triangleLb(int n) {
		for (int i=1; i<=n; i++)
		{
			for (int j=1;j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
