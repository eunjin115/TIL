package day_08;

import java.util.Random;

public class Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		//int n = 1+rand.nextInt(10);
		int n = 3;
		System.out.println("원반 갯수 : " + n);
		move(n,1,3);
		
	}
	public static void move(int no, int x, int y) {
		if(no>1)
			move(no-1,x,6-x-y);
		System.out.println("원반["+no+"]을 "+x+"기둥에서 " + y+"기둥으로 옮김");
	
		if(no>1)
			move(no-1,6-x-y,y);
	}
	
}
