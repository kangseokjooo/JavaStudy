package java_generic;

class Pair <K,V>{
	private K key;
	private V value;
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	public static <K,V> void print(K k,V v) {
		System.out.println("Key: "+k+","+"Value: "+v);
	}
}

public class GenericPractice1 {

	public static void main(String[] args) {
		Pair.print("One", 1);
		Pair.print(2, "Two");
	}

}
