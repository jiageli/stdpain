package xin.stdpain.pojo;

import java.util.Date;

public class Files {
	private Integer id;
	private String filename;
	private byte[] data;
	private Date uploadtime;
	
	@Override
	public String toString(){
		return "Files{"+id+","+filename+","+uploadtime+"}";
	}
	
	public Date getUploadtime() {
		return uploadtime;
	}
	public void setUploadtime(Date uploadTime) {
		this.uploadtime = uploadTime;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
}
