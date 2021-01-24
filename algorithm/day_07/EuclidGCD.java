package day_07;

import java.util.Random;

public class EuclidGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int x = 10 + rand.nextInt(10);
		int y = 20 + rand.nextInt(10);
		
		//System.out.println(x+"와  "+ y+"의 최대공약수는 " + gcd(x,y) + "입니다.");
		System.out.print(x+"와  "+ y+"의 최대 공약수는 ");

		int tmp = 0;
		for (int i = 0;;i++)	//반복문 
		{
			tmp = x%y;
			if(tmp == 0) {
				//tmp = y;
				break;
			}
			else{
				x = y;
				y = tmp;
				continue;
			}
		}
		System.out.println(y + "입니다.");
	}
	public static int gcd(int x, int y) {	//재귀 함수 
		if(y==0)
			return x;
		else
			return gcd(y,x%y);
		
	}
}
