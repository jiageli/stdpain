package xin.stdpain.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import xin.stdpain.dao.FileMapper;
import xin.stdpain.pojo.Files;
import xin.stdpain.service.FilesService;
@Service("fileService")
public class FilesServiceImp implements FilesService{

	@Resource
	private FileMapper filesdao; 
	
	@Override
	public int upload(Files file) {
		return this.filesdao.insert(file);
	}

	@Override
	public List<Files> listFile() {
		return filesdao.listFile();
	}

	@Override
	public Files getFileById(Integer id) {
		return this.filesdao.getFileById(id);
	}

	@Override
	public int delFileById(Integer id) {
		return this.filesdao.delFileById(id);
	}

}
