package md.meta.product.sort;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ProductSortApp {

	public static void main(String[] args) {
		
		String dd = null;
		
		System.out.println( dd.isEmpty()) ;
		
		SortedMap<String, String> lhm = new ConcurrentSkipListMap<>();
		lhm.put("000", "Zero 1");
		lhm.put("001", "One  1");
		lhm.put("100", "One Hundred 1");
		lhm.put("050", "Fifthy 1");
		lhm.put("000", "Zero 2");
		
		
		Map<String, String> lhm2 = new HashMap<>();
		
		lhm.put("002", "Two 1");
		lhm.put("001", "One  2");
		lhm.put("100", "One Hundred 2");
		lhm.put("050", "Fifthy 2");
		lhm.put("000", "Zero 3");
		
		//printMap(lhm);
		
		
		
		lhm.putAll(lhm2);
		printMap(lhm);
		
	}
	
	private static void  printMap(Map<String, String> map ) {
		
		long i = 0;
		
		for (Map.Entry<String, String> pair : map.entrySet()) {
		    //i += pair.getKey() + pair.getValue();
			System.out.println("[" + pair.getKey() + "] = [" + pair.getValue() + "]");
		}
	}
	
}
