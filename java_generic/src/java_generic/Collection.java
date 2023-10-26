package java_generic;

import java.util.*;

public class Collection {

	public static void main(String[] args) {
//		List<String> arrayList=new ArrayList<String>();
		//LinkedList
		List<String> linkedList=new LinkedList<String>();
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add(1,"C");
		System.out.println(linkedList);
		
		//HashSet
		Set<String> hashSet =new HashSet<String>();
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("A");
		System.out.println(hashSet);
		//LinckedHashSet
		Set<String> linkedHashSet=new LinkedHashSet<String>();
		linkedHashSet.add("C");
		linkedHashSet.add("B");
		linkedHashSet.add("A");
		System.out.println(linkedHashSet);
		//TreeSet
		Set<String> treeSet=new TreeSet<>();
		treeSet.add("B");
		treeSet.add("C");
		treeSet.add("A");
		System.out.println(treeSet);
		
		//HashMap
		Map<String, Integer> hashMap=new HashMap<String, Integer>();
		hashMap.put("one", 1);
		hashMap.put("two",2);
		hashMap.put("three",3);
		System.out.println(hashMap);
		System.out.println(hashMap.get("one"));
		//LinkedHashMap
		Map<String, Integer> link=new LinkedHashMap<String, Integer>();
		link.put("one", 1);
		link.put("three", 3);
		link.put("two", 2);
		System.out.println(link);
		
		//TreeMap
		Map<String, Integer> treeMap=new TreeMap<>();
		treeMap.put("C", 3);
		treeMap.put("A", 1);
		treeMap.put("B", 2);
		System.out.println(treeMap);

	}

}
