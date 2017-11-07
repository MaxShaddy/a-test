package md.meta;

public class Main {

	private static final String AMAZON_PARAM = "AMAZON_PARAM";
	private static final String GOOGLE_PARAM = "GOOGLE_PARAM";
	private static final String IDEALO_PARAM = "IDEALO_PARAM";
	
	public static void main(String[] args) {
		
		String url = "rdp://www.idealo.de/preisvergleich/MainSearchProductCategory.html?q=8950236670905";
		
		
		System.out.println( normlizaUrl(url));
		
		System.out.println( normlizaUrl( IDEALO_PARAM));
		
//		System.out.println( noProtocol.substring(0, indexOfSlash));
		
		
		
//		proceed(MetricRecord.MetricType.CAPTCHA_REQUEST, AMAZON_PARAM, 100);
//		MetricDashboard.printDashboard();
//		
//		proceed(MetricRecord.MetricType.CAPTCHA_REQUEST, AMAZON_PARAM, 10);
//		proceed(MetricRecord.MetricType.CAPTCHA_REQUEST, GOOGLE_PARAM, 10);
//		MetricDashboard.printDashboard();
//		
//		proceed(MetricRecord.MetricType.CAPTCHA_RESULT, GOOGLE_PARAM, 10);
//		proceed(MetricRecord.MetricType.CAPTCHA_ERROR, IDEALO_PARAM, 10);
//		MetricDashboard.printDashboard();
	}
	
	
	private static String normlizaUrl(String url) {
		StringBuilder sb = new StringBuilder(url);
		
		int indexOfProtocol = sb.indexOf("://");
		if(indexOfProtocol> -1) {
			sb.delete(0, indexOfProtocol + 3);
			int indexOfSlash = sb.indexOf("/");
			if (indexOfSlash >-1) {
				sb.delete(indexOfSlash, sb.length());
			}
		}
		return sb.toString(); 
	}
	
	private static void proceed(MetricRecord.MetricType mt, String param, int count){
		for (int i = 0; i<count;  i++ ) {
			MetricDashboard.touch( mt, param);
		}
	}

}
