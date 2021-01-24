package day_03;
import Util.Print_arr;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class ArrayEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		Print_arr p  = new Print_arr();
		System.out.print("n 입력 : ");
		int n = scan.nextInt();
		int [] a = new int[n];
		int [] b = new int[n];
		
		for (int i = 0; i<n; i++)
		{
			a[i] = 1 + rand.nextInt(10);
			b[i] = 1 + rand.nextInt(10);
		}
		System.out.print("Array of A : ");
		p.print_arr(a);
		System.out.println();
		System.out.print("Array of B : ");
		p.print_arr(b);
		
		System.out.println();
		System.out.println(a.equals(b));
		System.out.println(Arrays.equals(a, b));	//same result 
		b = Arrays.copyOf(a, b.length);
		
		System.out.println(Arrays.equals(a, b));
		
		
	}

}
