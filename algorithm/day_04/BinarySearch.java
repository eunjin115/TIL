package day_04;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {1,4,5,8,9,50,54,79,99,165};
		int index = binarysearch(a,79,0,9);
		System.out.println("찾는 값 인덱스 : " + index);
		
	}
	static int binarysearch(int [] a, int tar, int start, int end)
	{
		if (start>end)
			return -1;
		else {
			int middle = (start+end)/2;	//a.length로 하면 재귀할때 걸림
			if(a[middle] == tar)
				return middle;
			else if (tar<a[middle])
				return binarysearch(a,tar,start,middle-1);
			else
				return binarysearch(a,tar,middle+1,end);
		}
	}
}
