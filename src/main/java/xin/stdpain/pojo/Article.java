package xin.stdpain.pojo;

import java.util.Date;

public class Article {

	private Integer id;
	private String title;
	private String content;
	private String author;
	private Date createTime;
	private Date modityTime;

	@Override
	public String toString() {
		return "Article{" + id + "," + title + "," + content + "," + author + "," + createTime + "," + modityTime + "}";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModityTime() {
		return modityTime;
	}

	public void setModityTime(Date modityTime) {
		this.modityTime = modityTime;
	}

}
