package day_07;
import java.util.Random;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int n = 1 + rand.nextInt(10);
		System.out.print(n);
		//System.out.println("! = " + factorial(n));
		int tmp = 1; 
		for (int i = 1; i<=n; i++)	//반복문 
		{
			tmp *= i;	//tmp = tmp*i
		}
		System.out.println("! = " + tmp);
	}
	public static int factorial(int x) {	//재귀 함수 
		if(x>0)
			return x*factorial(x-1);
		else
			return 1;
	}
}
