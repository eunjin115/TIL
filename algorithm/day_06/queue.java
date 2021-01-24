package day_06;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class queue {

	private static final Object[] Integer = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> que = new LinkedList<Integer>();
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("n 입력 : ");
		int n = scan.nextInt();
		int[] arr = new int[n];
		int deque = 0;
 		for (int i = 0; i < n; i++) {
	        que.add(1 + rand.nextInt(10));
			System.out.println(que);
	    }
		
		System.out.println();
		System.out.println();
		
		if(!que.isEmpty())
			deque = que.poll();	//int deque하면 오류남 
		System.out.println("dequeue 한 값 : " + deque);
		
		System.out.println("dequeue 한 뒤 : "+ que);
		
		/*System.out.print("검색할 값 입력 : ");
		int key = scan.nextInt();*/

	}
	

}
