package java_algorithm_study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Day9_1 {

	public static void main(String[] args) throws Exception {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	     StringTokenizer st = new StringTokenizer(br.readLine());

	        long L = Long.parseLong(st.nextToken());
	        long U = Long.parseLong(st.nextToken());
	        long sum = 0;

	        for (long i = L; i <= U; i++) {
	            long num = i;
	            while (num >0 ) {
	                sum += num % 10;
	                num /= 10;
	            }
	        }

	        bw.write(String.valueOf(sum));
	        
	        bw.flush();
	        bw.close();
	    }
	//시간초과(unsolved)
}


