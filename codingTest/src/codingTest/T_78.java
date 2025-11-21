package codingTest;

import java.util.*;

public class T_78 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        for(int tc = 0; tc < T; tc++){
            int N = s.nextInt();
            int K = s.nextInt();

            int[] work = new int[N];
            int[] time = new int[N];

            for(int i = 0; i < N; i++) work[i] = s.nextInt();
            for(int i = 0; i < N; i++) time[i] = s.nextInt();
            //큰 설득 시간 -> 우선 배정 -> 설득 비용 0,
            //작은 설득 시간 -> 부족한 작업에 사용 -> 최소 비용

            List<int[]> w_tlist=new ArrayList<int[]>();
            for(int i=0;i<N;i++) w_tlist.add(new int[] {work[i],time[i]});
            
            boolean []flag=new boolean[K];
            
            List<Integer> rest=new ArrayList<Integer>();
            
            w_tlist.sort((a,b)->b[1]-a[1]);
//            for(int[] wt :w_tlist){
//                System.out.println(Arrays.toString(wt));
//            }
            
            for(int []arr:w_tlist) {
            	int w=arr[0]-1;
            	int t=arr[1];
            	
            	if(!flag[w]) flag[w]=true;
            	else rest.add(t);
            }
            Collections.sort(rest);
            
            int miss=0;
            for(boolean a:flag) if(!a) miss++;
            
            long answer=0;
            
            for(int i=0;i<miss;i++) answer+=rest.get(i);
            
            System.out.println("#"+(tc+1)+" "+answer);
        }
    }
    
    //Swea 게으름뱅이 왕국 D4
}
