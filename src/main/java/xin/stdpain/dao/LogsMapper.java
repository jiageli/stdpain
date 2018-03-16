package xin.stdpain.dao;

import java.util.List;

import xin.stdpain.pojo.Logs;

public interface LogsMapper {
	public int insert(Logs log);
	public List<Logs>listAll();
}
