package ch14.Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		//Map<K, V> map = new HashMap<>();
		//   K : key로 사용할 제네릭  , V : Value 를 사용할 제네릭.     

		//HashMap<key,객체(값)>
		HashMap<String, Integer> map = new HashMap<>();
		
		//.put(key,값) : Associates the specified value with the specified key in this map.
		map.put("김가가", 85);
		map.put("이나나", 90);
		map.put("박다다", 95);
		map.put("김라라", 100);
		map.put("이마마", 85);
		
		System.out.println(map);
		System.out.println("총 Entry 수: " + map.size());
		
		//키로 값을 얻어오기.
		String key = "오륙칠";
		int value = map.get("이마마");
		System.out.println("점수: " + value);
		System.out.println("점수: " + key.valueOf(value));
		
		//반복해서 키와 값을 얻기
		Set<String> KeySet = map.keySet();
		Iterator<String> keyIterator = KeySet.iterator();  //반복된 키를얻는다
		
		while (keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k + ":" + v);
		}
		
		//반복키값
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry <String, Integer>> entryIterator = entrySet.iterator();
		
		while (entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + ":" + v);
		}
		
	}

}
