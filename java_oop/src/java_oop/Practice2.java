package java_oop;

public class Practice2 {

	public static void main(String[] args) {
		Truck truck=new Truck("트럭", "검정");
		
		System.out.println("차의 종류: "+truck.getType());
		System.out.println("차의 색깔은: "+truck.getColor());
		System.out.print("지나갈때 소리:");
		truck.Sound();
	}

}
