package day_01;
import java.util.*;
public class Sum_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("n : ");
		int n = scan.nextInt();
		int sum = 0;
		for (int i = 0; i<=n; i++)
		{
			sum+=i;
		}
		System.out.println("sum : " + sum);
	}

}
