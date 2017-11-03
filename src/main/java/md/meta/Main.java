package md.meta;

public class Main {

	private static final String AMAZON_PARAM = "AMAZON_PARAM";
	private static final String GOOGLE_PARAM = "GOOGLE_PARAM";
	private static final String IDEALO_PARAM = "IDEALO_PARAM";
	
	public static void main(String[] args) {
		proceed(MetricType.CAPTCHA_REQUEST, AMAZON_PARAM, 100);
		MetricDashboard.printDashboard();
		
		proceed(MetricType.CAPTCHA_REQUEST, AMAZON_PARAM, 10);
		proceed(MetricType.CAPTCHA_REQUEST, GOOGLE_PARAM, 10);
		MetricDashboard.printDashboard();
		
		proceed(MetricType.CAPTCHA_RESULT, GOOGLE_PARAM, 10);
		proceed(MetricType.CAPTCHA_ERROR, IDEALO_PARAM, 10);
		MetricDashboard.printDashboard();
	}
	
	private static void proceed(MetricType mt, String param, int count){
		for (int i = 0; i<count;  i++ ) {
			MetricDashboard.touch( mt, param);
		}
	}

}
