package day_05;

import Util.Print_arr;

public class Gstack<E> {	//제너릭으로 구현
	private int max;
	private int ptr;
	private E[] stk;
	
	// 실행할 때 예외：스택이 비어 있음
	public static class EmpstackException extends RuntimeException {
		public EmpstackException() {
		}
	}

	// 실행할 때 예외：스택이 가득 참
	public static class OverflowstackException extends RuntimeException {
		public OverflowstackException() {
		}
	}
	
		//제네릭은 exception static으로 해야 한다
	public Gstack(int capacity)
	{
		ptr = 0;
		max = capacity;
		try {
			stk = (E[]) new Object[max]; 
		} catch (OutOfMemoryError e) { // 생성할 수 없습니다.
			max = 0;
		}
	}
	
	public E push(E x) throws OverflowstackException{
		if (ptr >= max)
			throw new OverflowstackException();
		return stk[ptr++] = x;
	}
	public E pop() throws EmpstackException{
		if(ptr<=0)
			throw new EmpstackException();
		return stk[--ptr];
	}
	public E peek() throws EmpstackException{
		if(ptr<=0)
			throw new EmpstackException();
		return stk[ptr-1];
	}
	public int indexOf(E x) {
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
		if(ptr<=0) {
			System.out.println("스택 비었음");
		}
		else {
			for (int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}	
	}
	
}
