package java_generic;

import java.util.*;

public class CollectionPractice1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<String,Integer> map=new HashMap<String, Integer>();
		
		while(true) {
			System.out.println("이름을 입력하세요: ");
			String name=sc.next();
			if(name.equals("종료")) {
				break;
			}else {
				System.out.println("나이를 입력하세요:");
				int age=sc.nextInt();
				map.put(name, age);
			}
			
		}
		  sc.close();
		 System.out.println("입력받은 이름과 나이 목록:");
	        for (Map.Entry<String, Integer> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue() + "세");
	        }
		
	}

}
