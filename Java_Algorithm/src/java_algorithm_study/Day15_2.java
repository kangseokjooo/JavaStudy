package java_algorithm_study;

public class Day15_2 {

	public static void main(String[] args) {
		boolean []selfarr=new boolean[10001];
		for(int i=0;i<=10000;i++) {
			int num=i;
			int sum=i;
			while(num>0) {
				sum+=num%10;
				num/=10;
			}
			if(sum <=10000) {
				selfarr[sum]=true;
			}
		}
		for(int i=0;i<=10000;i++) {
			if(!selfarr[i]) System.out.println(i);
		}

	}

}
