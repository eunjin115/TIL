package day_05;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Stack<Integer> stack = new Stack<>();
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	System.out.print("n 입력 : ");
	int n = scan.nextInt();
	for (int i = 0; i < n; i++) {
        stack.push(1 + rand.nextInt(10));
        System.out.print(stack.peek()+" ");
    }
	System.out.println();
	System.out.println();
	if(!stack.isEmpty()){
		int pop = stack.pop();
		System.out.println("pop : "+pop);
	}
	else {
		System.out.println("pop : -1");
	}
	int size = stack.size();
	if(!stack.empty())
		System.out.println("1");
	else
		System.out.println("0");
	
	if(!stack.isEmpty()) {
		System.out.println("top : " + stack.peek());
	}
	else
		System.out.println("top : -1");
	}

}
