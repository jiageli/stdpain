package xin.stdpain.pojo;

import java.util.Date;

public class Logs {
	private Integer id;
	private String author;
	private String optype;
	private String content;
	private Date time;

	@Override
	public String toString() {
		return "Logs{" + id + "," + author + "," + optype + "," + content + "," + time + "}";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getOptype() {
		return optype;
	}

	public void setOptype(String optype) {
		this.optype = optype;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
}
