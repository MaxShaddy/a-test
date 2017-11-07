package md.meta;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MetricDashboard {
	
	private static HashMap<String, MetricRecord> db = new HashMap<String, MetricRecord>();
	
	public static void touch(MetricRecord.MetricType mt, String param) {
		LocalDateTime ldtNow = LocalDateTime.now().withMinute(0).withSecond(0).withNano(0);
		StringBuilder hashMapKeyBuilder  = new StringBuilder();
			String hashMapKey = hashMapKeyBuilder.append(ldtNow.toString()).append(mt.toString()).append(param).toString();
			
		MetricRecord metricRecord = db.get(hashMapKey);
		if ( metricRecord == null) {
			metricRecord = new MetricRecord(mt , ldtNow, param);
			metricRecord.increase();
			db.put(hashMapKey, metricRecord);
		} else {
			metricRecord.increase();
		}
	}
	
	public static void printDashboard() {
		System.out.println(" =============== DASHBOARD =============== ");
		db.entrySet().forEach(item-> {
			System.out.println(item.getValue().toString());
		});
		System.out.println(" ========================================= ");
		
		
		//db.clear();
		
		List<MetricRecord> values = new ArrayList<MetricRecord>(  db.values() );
		
		
		for (MetricRecord item: values) {
			System.out.println( item.toString() );
		}
		System.out.println(" ========================================= ");
	}

}
