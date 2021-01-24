package day_05;
import Util.Print_arr;
public class IntStack {

	private int max;
	private int ptr;
	private int[] stk;
	
	public class EmpIntStackException extends RuntimeException{
		public EmpIntStackException() {}
	}
	
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	
	public IntStack(int capacity)
	{
		ptr = 0; 
		max = capacity;
		try {
			stk = new int[max];
		} catch(OutOfMemoryError e)
		{
			max = 0;
		}
		
	}
	
	public int push(int x) throws OverflowIntStackException{
		if (ptr >= max)
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	public int pop() throws EmpIntStackException{
		if(ptr<=0)
			throw new EmpIntStackException();
		return stk[--ptr];
	}
	public int peek() throws EmpIntStackException{
		if(ptr<=0)
			throw new EmpIntStackException();
		return stk[ptr-1];
	}
	public int indexOf(int x) {
		for (int i = ptr-1; i>=0; i--)	//0부터 ptr or ptr 부터 0까지 
		{
			if(stk[i]==x)
				return i;
		}
			return -1;

	}
	
	public void clear()	//스택을 비움 -> 배열 없애기? 
	{
		ptr = 0; 
	}
	
	public int capacity() {
		return max;
	}
	
	public int size()
	{
		return ptr;
	}
	
	public boolean isEmpty()
	{
		return ptr<=0;
	}
	
	public boolean isFull() {
		return ptr>=max;
	}
	
	public void dump() {
		Print_arr p = new Print_arr();
		if(ptr<=0) {
			System.out.println("스택 비었음");
		}
		else {
			//p.print_arr(stk);
			for (int i = 0; i < ptr; i++)	//현재 포인터 만큼 출력하기 (length로 하면 0으로 배열 크기 모두 출력) 
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
	
}
