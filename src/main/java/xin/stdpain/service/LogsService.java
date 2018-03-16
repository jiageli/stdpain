package xin.stdpain.service;

import java.util.List;

import xin.stdpain.pojo.Logs;

public interface LogsService {
	public int insertLog(Logs log);
	public List<Logs>listAll();
}
