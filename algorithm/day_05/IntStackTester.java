package day_05;
import java.util.*;
public class IntStackTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		IntStack s = new IntStack(64);	//최대 64칸 저장 

		while (true) {
			System.out.println("현재 데이터 수：" + s.size() + " / "
															  + s.capacity());
			System.out.print("(1)푸시　(2)팝　(3)피크　" +
								  "(4)덤프　(5)검색　(0)종료：");

			int menu = scan.nextInt();
			if (menu == 0) break;

			int x;
			switch (menu) {
			 case 1: 							// 푸시
				System.out.print("데이터：");
				x = scan.nextInt();
				try {
					s.push(x);
			 	} catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;

			 case 2: 							// 팝
				try {
			 		x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
			 	} catch (IntStack.EmpIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			 case 3: 							// 피크
				try {
			 		x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
			 	} catch (IntStack.EmpIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			 case 4: 							// 덤프
				s.dump();
				break;
				
			 case 5: 
					System.out.print("검색 값 입력 : ");
					int tmp = scan.nextInt();
					int idx = s.indexOf(tmp);
					System.out.println("찾는 값 인덱스 : "+ idx);
					break;
			}
		}

	}

}
