package Problem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.io.*;

public class _10845 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Queue<Integer> que = new LinkedList<Integer>();
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    int cnt = Integer.parseInt(br.readLine());
	    int n = 0;
	    for (int i = 0; i<cnt; i++) {
	    String[] input = br.readLine().split(" ");
	    switch (input[0]) {
	    case "push":
	    	n = Integer.parseInt(input[1]);
	    	que.add(n);
	    	break;
	    case "pop":
	    	if(!que.isEmpty())
	    		bw.write(que.poll()+"\n");
	    	else
	    		bw.write("-1"+"\n");
	    	break;

	    case "size":
	    	bw.write(que.size()+"\n");
	    	break;

	    case "empty":
	    	if(!que.isEmpty())
	    		bw.write("0"+"\n");
	    	else
	    		bw.write("1"+"\n");
	    	break;
	    case "front":
	    	if(!que.isEmpty())
	    		bw.write(que.peek()+"\n");
	    	else
	    		bw.write("-1"+"\n");
	    	break;
	    	
	    case "back":
	    	if(!que.isEmpty())
	    		bw.write(n+"\n");
	    	else
	    		bw.write("-1"+"\n");
	    	break;
	    	
	    }
	    
	    }
	    bw.flush();
	    bw.close();
	    
	}

}
