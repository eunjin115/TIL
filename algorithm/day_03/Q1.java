package day_03;

import java.util.Scanner;
import java.util.Random;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int n = 1 + rand.nextInt(10); 	//get random integer 1 between 10
		System.out.println("사람 수  : " + n);

		
		int [] h = new int [n];
		
		/*for (int i = 0; i<n; i++)
		{
			System.out.print("height["+i+"] : ");
			h[i] = scan.nextInt();
			System.out.println();
		}*/
		
		
		for (int i = 0; i<n; i++)
		{
			h[i] = 100 + rand.nextInt(90);	//rand -> get random integer 0 between 89
			System.out.println("height["+i+"] : " + h[i]);
		}
		System.out.println("max : "+ Maxof(h));
		
	}
	static int Maxof(int[] a)
	{
		int max = a[0];
		for (int i = 0; i<a.length; i++)
		{
			if(a[i]>max)
				max = a[i];
		}
		return max;
		
	}

}
