package md.meta;

import java.time.LocalDateTime;

public class MetricRecord {
	
	private MetricType type;
	
	private LocalDateTime dateTime;

	private String param;
	
	private int score = 0;
	
	public MetricRecord(MetricType type, LocalDateTime dateTime, String param) {
		super();
		this.type = type;
		this.dateTime = dateTime;
		this.param = param;
	}

	public void increase() {
		this.score++;
	}
	
	@Override
	public String toString() {
		return "MetricRecord [type=" + type + ", dateTime=" + dateTime + ", param=" + param + ", score=" + score + "]";
	}

	public MetricType getType() {
		return type;
	}

	public void setType(MetricType type) {
		this.type = type;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}
