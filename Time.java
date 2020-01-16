package by.select.stage4.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Time {
	public static void main(String[] args) {
		int x;

		x = 20000000;
		ArrayList<Integer> arrayListObject = new ArrayList<Integer>();
		LinkedList<Integer> linkedListObject = new LinkedList<Integer>();
		HashSet<Integer> hashSetObject = new HashSet<Integer>();
		TreeSet<Integer> treeSetObject = new TreeSet<Integer>();
		HashMap<Integer, Integer> hashMapObject = new HashMap<Integer, Integer>();
		TreeMap<Integer, Integer> treeMapObject = new TreeMap<Integer, Integer>();

		print("ArrayList vs LinkedList");
		fill(x, arrayListObject);
		fill(x, linkedListObject);
		countAdd(x, arrayListObject);
		countAdd(x, linkedListObject);

		countFind(arrayListObject);
		countFind(linkedListObject);

		countRemove(x, arrayListObject);
		countRemove(x, linkedListObject);

		print("--------------------------------");
		print("HashSet vs TreeSet");
		fill(x, hashSetObject);
		fill(x, treeSetObject);

		countAdd(x, hashSetObject);
		countAdd(x, hashSetObject);
		countFind(hashSetObject);
		countFind(treeSetObject);

		countRemove(x, hashSetObject);
		countRemove(x, treeSetObject);

		print("--------------------------------");
		print("HashMap vs TreeMap");
		fillMap(x, hashMapObject);
		fillMap(x, treeMapObject);

		countMapAdd(x, hashMapObject);
		countMapAdd(x, treeMapObject);

		countMapFind(hashMapObject);
		countMapFind(treeMapObject);

		countRemove(x, hashSetObject);
		countRemove(x, treeSetObject);

	}

	public static void fill(long x, Collection<Integer> collection) {
		for (int i = 0; i < x; i++) {
			collection.add(i);
		}
	}

	public static void fillMap(long x, Map<Integer, Integer> map) {
		for (int i = 0; i < x; i++) {
			map.put(i, i);
		}
	}

	public static void countAdd(int x, Collection<Integer> collection) {
		long start;
		long end;
		int value;

		value = x + 1;

		start = System.currentTimeMillis();
		System.out.println("Start");
		collection.add(value);
		end = System.currentTimeMillis();

		System.out.println("Operation takes " + (end - start) + "ms");
	}

	public static void countMapAdd(int x, Map<Integer, Integer> map) {
		long start;
		long end;
		int value;

		value = x + 1;

		start = System.currentTimeMillis();
		System.out.println("Start");
		map.put(value, value);
		end = System.currentTimeMillis();

		System.out.println("Operation takes " + (end - start) + "ms");
	}

	public static void countFind(Collection<Integer> collection) {
		long start;
		long end;
		boolean boo;
		int value;

		value = 500000;

		start = System.currentTimeMillis();
		System.out.println("Start");
		boo = collection.contains(value);
		if (boo) {
			end = System.currentTimeMillis();
			System.out.println("Operation takes " + (end - start) + "ms");

		}

	}

	public static void countMapFind(Map<Integer, Integer> map) {
		long start;
		long end;
		boolean boo;
		int value;

		value = 500000;

		start = System.currentTimeMillis();
		System.out.println("Start");
		boo = map.containsKey(value);
		if (boo) {
			end = System.currentTimeMillis();
			System.out.println("Operation takes " + (end - start) + "ms");

		}

	}

	public static void countRemove(int x, Collection<Integer> collection) {
		long start;
		long end;
		int value;

		value = x - 50000;

		start = System.currentTimeMillis();
		System.out.println("Start");
		collection.remove(value);
		end = System.currentTimeMillis();
		System.out.println("Operation takes " + (end - start) + "ms");

	}

	public static void print(String message) {
		System.out.println(message);
	}

}
