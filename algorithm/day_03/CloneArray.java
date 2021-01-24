package day_03;

public class CloneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4,5};
		int [] b = a.clone();
		
		for (int i = 0; i<a.length; i++)
		{
			System.out.println("a["+i+"] : " + a[i] );
			System.out.println("b["+i+"] : " + b[i] );
		}
		
	}

}
