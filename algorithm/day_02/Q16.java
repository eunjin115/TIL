package day_02;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n;
		do {
		System.out.print("단 입력 : ");
		n = scan.nextInt();
		} while (n<=0);
		
		triangleLB(n);
		System.out.println();
		triangleLU(n);
		System.out.println();
		triangleRU(n);
		System.out.println();
		triangleRB(n);
		
	}

	static void triangleLB(int n) {
		for (int i=1; i<=n; i++)
		{
			for (int j=1;j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	static void triangleLU(int n) {
		for (int i=n; i>=1; i--)
		{
			for (int j=i;j>=1; j--)
				System.out.print("*");
			System.out.println();
		}
	}
	static void triangleRU(int n) {
		for (int i=n; i>=1; i--)
		{	
			for (int j=0; j<n-i; j++)
				System.out.print(" ");
			
			for (int j=i;j>=1; j--) 
			{
				System.out.print("*");
			}
			System.out.println();

		}
	}
	static void triangleRB(int n) {
		for (int i=1; i<=n; i++)
		{	
			for (int j=i; j<=n-1; j++)
				System.out.print(" ");
			
			for (int j=1;j<=i; j++)
				System.out.print("*");
			System.out.println();

		}
	}
}
