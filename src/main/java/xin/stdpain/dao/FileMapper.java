package xin.stdpain.dao;

import java.util.List;

import xin.stdpain.pojo.Files;

public interface FileMapper {
	public int insert(Files files);
	public List<Files>listFile();
	public Files getFileById(Integer id);
	public int delFileById(Integer id);
}
