package day_03;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("n : ");
		int n = scan.nextInt();
		
		int [] x = new int [n];
		
		for (int i=  0; i<n; i++)
		{
			x[i] = i;
			System.out.println("x["+i + "] : " + x[i]);
		}
		
		reverse(x);
		
		System.out.println("After Reverse Array ");		
		for (int i=  0; i<n; i++)
		{
			System.out.println("x["+i + "] : " + x[i]);
		}
			
	}

	static void reverse(int[] a)
	{
		for (int i = 0; i<a.length/2; i++)
		{
			swap(a,i,a.length-i-1);
		}
		
		
	}
	static public void swap(int[] a, int i, int j)	//i&j -> index
	{
		int tmp = a[i];
		a[i] = j;
		a[j] = tmp;
		
	}


}
