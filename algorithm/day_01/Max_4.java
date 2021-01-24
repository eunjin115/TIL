package day_01;
import java.util.*;
public class Max_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a : ");
		int a = scan.nextInt();
		System.out.print("b : ");
		int b = scan.nextInt();
		System.out.print("c : ");
		int c = scan.nextInt();
		System.out.print("d : ");
		int d = scan.nextInt();
		
		int max = 0;
		
		max = max_func(a,b,c,d);
		
		System.out.println("최댓값 : "+ max);

	
	}
	static int max_func(int a, int b, int c,int d)
	{
		int max = a;
		if (b>max) max = b;
		if (c>max) max = c;
		if (d>max) max = d;
		return max;
	}

}
