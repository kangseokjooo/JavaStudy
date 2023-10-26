package java_generic;
import java.util.*;

public class GenericExample3 {
	
	//와일드 카드
	public void processList(ArrayList<? extends Number> list) {
		for(Number num : list) {
			System.out.print(num);
			System.out.println();
		}
		
	}
	public <T extends Number> void addToNumberList(ArrayList<T> list,T item) {
		list.add(item);
	}
	//? super T
	public void processList2(ArrayList<? super Integer> list) {
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
	}
	public static void main(String[] args) {
		GenericExample3 example=new GenericExample3();
		ArrayList<Integer> integerList=new ArrayList<Integer>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		
		ArrayList<Double> doubleList=new ArrayList<Double>();
		doubleList.add(1.1);
		doubleList.add(2.1);
		doubleList.add(3.1);
		
		//와일드카드 ? extends T 은 읽기 전용으로 주로 사용한다.
		example.processList(integerList);
		example.processList(doubleList);
		
		example.addToNumberList(integerList, 4);
		example.addToNumberList(doubleList, 4.1);
		for(int val:integerList) {
			System.out.print(val+" ");
		}
		System.out.println();
		for(double val:doubleList) {
			System.out.print(val+" ");
		}
		System.out.println();
		//와일드카드 ? super T 는 쓰기 전용으로 주로 사용.
		ArrayList<Number> numbers=new ArrayList<Number>();
		example.processList2(numbers);
//		System.out.println(numbers);
		for(int i=0;i<numbers.size();i++) {
			System.out.print(numbers.get(i)+" ");
		}
		//와일드 카드 주의사항
		//1.복잡성: 와일드카드를 과도하게 사용하게 되면 복잡성이 증가하며, 협업에 맞지 알맞지 않는다.
		//2.제한된작업: "? extends T" 새로운 요소 추가 불가
	}

}
