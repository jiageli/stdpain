package xin.stdpain.pojo;

import java.util.Date;

public class Task {
	private Integer id;
	private Date startTime;
	private Date endTime;
	private String title;
	private String content;
	private String from;

	@Override
	public String toString() {
		return "Task{" + id + "," + startTime + "," + endTime + "," + title + "," + content + "," + from + "}";
	}
	
	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
