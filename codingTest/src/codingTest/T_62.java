package codingTest;

import java.util.*;

public class T_62 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int t=s.nextInt();
		for(int tc=0;tc<t;tc++) {
			int num=s.nextInt();
			
				int arr[]=new int[1000];
				for(int j=0;j<arr.length;j++) arr[j]=s.nextInt();
				
				Map<Integer,Integer> map=new HashMap<Integer, Integer>();
				
				for(int j=0;j<arr.length;j++) {
					map.put(arr[j], map.getOrDefault(arr[j], 0)+1);
				}
				List<Integer> list=new ArrayList<Integer>();
				
				for(int a:map.keySet()) {
					list.add(a);
				}
				
				list.sort((a,b)->{
					int Fa=map.get(a);
					int Fb=map.get(b);
					
					if(Fa!=Fb) return Fb-Fa;
					return b-a;
				});
				int answer=list.get(0);
				
				System.out.println("#"+num+" "+answer);
			}
		}
	//SWEA 최빈수 
	}
