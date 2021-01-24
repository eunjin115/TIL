package day_09;

public class IntSet {

	private int max;
	private int num;
	private int[] set;
	public IntSet(int capacity) {
		num = 0;
		max = capacity;
		try {
			set = new int[max];
		}
		catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	public int capacity() {
		return max;
	}
	public int size() {
		return num;
	}
	public int indexOf(int n) {
		for(int i = 0; i<num; i++) {
			if(set[i] == n)
				return i;
		}
		return -1;
	}
	public boolean contains(int n) {
		return (indexOf(n)!= -1) ? true:false;
	}
	
	public boolean add(int n) {
		if(num >= max || contains(n) == true)
			return false;
		else {
			set[num++] = n; 
			return true;
		}
			
	}
	
	public boolean remove(int n) {
		int idx;
		if(num<=0||(idx = indexOf(n))==-1)
			return false;
		else {
			set[idx] = set[--num];	//set[num]은 초기화를 안해도 될까?? 
			return true;
		}
	}
	
	public void copyTo(IntSet s) {
		int n = (s.max<num) ? s.max : num;
		for(int i = 0; i<n; i++)
			s.set[i] = set[i];
		s.num = n;
	}
	
	public void copyFrom(IntSet s) {
		int n = (max<s.num) ? max : s.num;
		for(int i = 0; i<n; i++)
			s.set[i] = set[i];
		s.num = n;
	}
	

		public boolean equalTo(IntSet s) {
			if (num != s.num) 
				return false; 

			for (int i = 0; i < num; i++) {
				int j = 0;
				for (; j < s.num; j++)
					if (set[i] == s.set[j])
						break;	//같은 원소가 있으면 break하고 for문 계속 돌기 
				if (j == s.num) //모두 같으면 j가 한번 더 돌았을 것 
					return false;
			}
			return true;
		}

		// 집합 s1과 s2의 합집합을 복사합니다.
		public void unionOf(IntSet s1, IntSet s2) {
			copyFrom(s1); // 집합 s1을 복사합니다.
			for (int i = 0; i < s2.num; i++) // 집합 s2의 요소를 추가합니다.
				add(s2.set[i]);
		}

		// "{ a b c }"형식의 문자열로 표현을 바꿉니다.
		public String toString() {
			StringBuffer temp = new StringBuffer("{ ");
			for (int i = 0; i < num; i++)
				temp.append(set[i] + " ");
			temp.append("}");
			return temp.toString();
		}

	
}
