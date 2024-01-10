package java_algorithm_study;
import java.util.*;

public class timeComplexityExample {

	public static void main(String[] args) {
		//1에서 100까지의 랜덤 값 선택 
		int findNumber =(int)(Math.random()*100);
		for(int i=0;i<100;i++) {
			if(i == findNumber) {
				System.out.println(i);
				break;
			}
		}
	}

}
