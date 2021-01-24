package day_03;
import java.util.Scanner;
import Util.Swap;	//Use other package 

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("n : ");
		int n = scan.nextInt();
		
		int [] x = new int [n];
		for (int i=  0; i<n; i++)
		{
			x[i] = i;
		}
		print_arr(x);
		
		System.out.println();
		reverse(x);
		
		

	}

	static void reverse(int[] a)
	{
		Swap s = new Swap();
		for(int i = 0; i<a.length/2; i++)
		{	
			int tmp = a.length-i-1;
			System.out.println("a["+i+"]와 a[" + tmp + "]와 교환 ");
			s.swap(a,i,a.length-i-1);
			
			print_arr(a);
			
			System.out.println();
		}
		
		
	}
	static void print_arr(int[] a)
	{
		for (int i = 0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
	/*static public void swap(int[] a, int i, int j)	//i&j -> index
	{
		int tmp = a[i];
		a[i] = j;
		a[j] = tmp;
		
	}*/


}
