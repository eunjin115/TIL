package Problem;

import java.util.Scanner;

public class _3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
		int[] tmp = new int[10];
		for (int i = 0; i<10; i++)
			arr[i] = scan.nextInt();
		for (int i = 0; i<10; i++)
			tmp[i] = arr[i]%42;
		
		int cnt = 0;
		int count = 0;
		for (int i = 0; i<10; i++) {
			cnt = 0;
			for(int j = i+1; j<10; j++) {
				if(tmp[i] == tmp[j])	//같은게 있으면 cnt 증가
										//숫자의 갯수를 구하는 게 아니라 종류를 구하는 것 (같은 수 있어도 배열 끝에 가서는 같은 값이 없으므로 종류를 하나 더해준다.) 
					cnt++;
			}
			if(cnt == 0)
				count++;
		}
		System.out.println(count);
	}

}
