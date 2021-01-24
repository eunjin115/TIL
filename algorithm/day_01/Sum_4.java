package day_01;

import java.util.Scanner;

public class Sum_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("a : ");
		int a = scan.nextInt();
		int length = (int)(Math.log10(a)+1);
		System.out.println("그 수는 "+length + "자리 입니다.");


	}

}
