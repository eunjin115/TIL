package day_01;
import java.util.*;
public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a : ");
		int a = scan.nextInt();
		System.out.print("b : ");
		int b = scan.nextInt();
		System.out.print("c : ");
		int c = scan.nextInt();
		
		int max = a;
		if (b>max) max = b;
		if (c>max) max = c;
		
		System.out.println("최댓값 : "+ max);
		
		max = max_func(a,b,c);
		
		System.out.println("함수_최댓값 : "+ max);

	
	}
	static int max_func(int a, int b, int c)
	{
		int max = a;
		if (b>max) max = b;
		if (c>max) max = c;
		
		return max;
	}

}
