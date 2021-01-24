package day_01;
import java.util.*;
public class Sum_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a,b;
		int sum = 0;
		System.out.print("a : ");
		a = scan.nextInt();
		do {
			System.out.print("b : ");
			b = scan.nextInt();
			System.out.println("a보다 큰 값을 입력하세요");
		}while (b<=a);
		
		System.out.println(b-a);
	}

}
