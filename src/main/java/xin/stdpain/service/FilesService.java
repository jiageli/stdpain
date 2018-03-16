package xin.stdpain.service;


import java.util.List;

import xin.stdpain.pojo.Files;
public interface FilesService {
	public int upload(Files file);
	public List<Files>listFile();
	public Files getFileById(Integer id);
	public int delFileById(Integer id);
}
