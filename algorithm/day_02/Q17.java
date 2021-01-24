package day_02;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n;
		do {
		System.out.print("단 입력 : ");
		n = scan.nextInt();
		} while (n<=0);
		
		spria(n);
	}
	static void spria(int n)
	{
		for(int i=1;i<=n;i++){
			   for(int j=n;j>i;j--)
			        System.out.print(" ");
	
			    for(int j=1;j<=(i-1)*2+1;j++)
				{
					System.out.print("*");
				}
			    System.out.println();
		}
	}
}
