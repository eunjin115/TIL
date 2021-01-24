package day_04;
import java.util.*;
import Util.Print_arr;
public class SeqSearch_key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		Print_arr p = new Print_arr();
		System.out.print("n 입력 : ");
		int n = scan.nextInt();
		int [] a = new int[n+1];
		
		for (int i = 0; i<=n; i++)
		{
			a[i] = 1 + rand.nextInt(10);
		}
		System.out.print("검색할 값 입력 : ");
		int key = scan.nextInt();
		p.print_arr(a);
		int index = seqSearch(a,n,key);
		
		if(index!=-1)
			System.out.println("찾는 값 인덱스 : "+index);
		else
			System.out.println("그런 값 없습니다.");
	}
	static int seqSearch(int[]a, int n, int key)
	{
		a[n] = key;
		int i = 0;
		
		while (true)
		{
			if(a[i]==key)	//종료조건을 두개에서 한개로 줄이기 (배열 끝까지 없는 경우 + 증긴에 찾는 값이 있는 경우) 
				break;
			i++;
		}
		return i == n ? -1 : i;
	}

}
