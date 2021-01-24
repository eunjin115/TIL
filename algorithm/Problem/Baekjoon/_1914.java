package Problem;

import java.math.BigInteger;
import java.util.Scanner;

public class _1914 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger c = new BigInteger("2");
        c = c.pow(n).subtract(BigInteger.ONE);	//2^n-1이 최소 움직임
        System.out.println(c);	
		if(n<=20)
			move(n,1,2,3);
		else
			return;
		
	}
	//작은원반 1~n-1개를 A에서 B로 이동
	//n원반을 A에서 C로 이동
	//1~n-1원반을 B에서 C로 이동 
	//이 과정을 쪼개서 재귀로 구현
	//one -> from / two -> by / three -> to 
	public static void move(int n, int one, int two, int three) {
        if(n == 1)
            System.out.println(one + " " + three);
        
        else
        {
        	move(n - 1, one, three, two);
            System.out.println(one + " " + three);
            move(n - 1, two, one, three);
		
        }
	}
	
}
