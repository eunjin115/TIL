package Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _9012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	    int cnt = Integer.parseInt(br.readLine());
	    
	    int i = 0;
	    while(cnt-->0) {
	    	boolean flag = true;
	    	String input = br.readLine();
			Stack<Character> stack = new Stack<Character>();
			char tmp;
			
			for(i = 0; i<input.length(); i++) {
				tmp = input.charAt(i);	//한 글자씩 끊기 
				if(tmp=='(') {	//push 
					stack.push(tmp);
				}
				else if(tmp==')') {	//pop -> ')'에 맞는 '(' pop
					if(!stack.isEmpty())
						stack.pop();
					else {
						flag = false;
						break;
					}
				}
			}
			if(!stack.isEmpty()) 
				flag = false;
			
			if(!flag)
				System.out.println("NO");
			else
				System.out.println("YES");
	    }
	}

}
