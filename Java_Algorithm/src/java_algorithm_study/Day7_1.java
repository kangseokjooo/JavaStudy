package java_algorithm_study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Day7_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter br=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N=Integer.parseInt(bf.readLine());
		for(int i=0;i<N;i++) {
			StringTokenizer st=new StringTokenizer(bf.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());		
			br.write("Case #"+String.valueOf(i+1)+": "+String.valueOf(x+y));
			br.newLine();
		}
		br.flush();
		br.close();
	}

}
