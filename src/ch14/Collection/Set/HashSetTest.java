package ch14.Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		//어떤 방식으로 써도 HashSet을 쓰는것임.
		//Set<String> set1 = new HashSet<String>();
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("jdbc");
		set.add("jsp");
		set.add("java");
		System.out.println(set);
		int size = set.size();
		System.out.println(size);
	}
	
}

/*
set은 중복저장이 안되기때문에 java가 1개만 저장이 된다.



*/