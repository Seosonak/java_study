package ch14.Collection.Set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// 정렬과 검색에 적합
		TreeSet<Integer> scores = new TreeSet<>();

		scores.add(7);
		scores.add(4);
		scores.add(1);
		scores.add(5);
		scores.add(9);

		// 자동으로 정렬(오름차순)
		for (Integer s : scores) {
			System.out.print(s + " ");
		}
		System.out.println();

		System.out.println("가장 낮은 값 : " + scores.first());
		System.out.println("가장 높은 값 : " + scores.last());
		System.out.println("5보다작은값:" + scores.lower(5));
		System.out.println("5보다 큰값:" + scores.higher(5));

		System.out.println();

		// 내림차순
		NavigableSet<Integer> desc = scores.descendingSet();
		for (Integer s : desc) {
			System.out.print(s + " ");
		}
		
		System.out.println();

		// 범위검색 (5 <= )
		// tailSet(값, boolean) : 주어진값보다 높은값을 가져온다 , boolean은 해당값을 포함하는지안하는지
		NavigableSet<Integer> rangeSet = scores.tailSet(5, false); 
		for (Integer s : rangeSet) {
			System.out.print(s + " ");
		}

		System.out.println();
		// 범위검색 (4 <= s < 9)
		// subSet(값, boolean, 값, boolean) : 
		rangeSet = scores.subSet(4, true, 9, false);
		for (Integer s : rangeSet) {
			System.out.print(s + " ");
		}
	}

}
