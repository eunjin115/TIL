package Problem;

import java.util.Scanner;
import java.util.Stack;
import java.io.*;

public class _10828 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//int cnt = sc.nextInt();
	    int cnt = Integer.parseInt(br.readLine());
	   // int i = 1;
	    for (int i = 0; i<cnt; i++) {
	   // String input = sc.next();
	    String[] input = br.readLine().split(" ");
	    switch (input[0]) {
	    case "push":
	    	//int n = sc.nextInt();
	    	int n = Integer.parseInt(input[1]);
	    	stack.add(n);
	    	break;
	 
	    case "top":
	    	if(!stack.isEmpty())
	    		//System.out.println(stack.peek());
	    		bw.write(stack.peek()+"\n");
	    	else
	    		bw.write("-1"+"\n");
	    	break;
	    	
	    case "pop":
	    	if(!stack.isEmpty())
	    		bw.write(stack.pop()+"\n");
	    		//System.out.println(stack.pop());
	    	else
	    		bw.write("-1"+"\n");
	    		//System.out.println("-1");
	    	break;

	    case "size":
	    	bw.write(stack.size()+"\n");
	    	//System.out.println(stack.size());
	    	break;

	    case "empty":
	    	if(!stack.isEmpty())
	    		bw.write("0"+"\n");
	    	else
	    		bw.write("1"+"\n");
	    	break;
	    	
	    }
	    
	    }
	    bw.flush();
	    bw.close();
	    
	}

}
