package day_01;

import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a : ");
		int a = scan.nextInt();
		System.out.print("b : ");
		int b = scan.nextInt();
		System.out.print("c : ");
		int c = scan.nextInt();
		
		System.out.println("중앙값 : "+med(a,b,c));
	}
	static int med(int a, int b, int c)
	{
		if (a>=b) {
			if (b>=c)
				return b;
			else if (a<=c)
				return a;
			else 
				return c;		
		}
		else if (a>c)
			return a;
		else if(b>c)
			return c;
		else
			return b;
	}

}
