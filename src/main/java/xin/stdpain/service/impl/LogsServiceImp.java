package xin.stdpain.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import xin.stdpain.dao.LogsMapper;
import xin.stdpain.pojo.Logs;
import xin.stdpain.service.LogsService;

@Service("logsService")
public class LogsServiceImp implements LogsService {

	@Resource
	private LogsMapper logsdao;

	@Override
	public int insertLog(Logs log) {
		return logsdao.insert(log);
	}

	@Override
	public List<Logs> listAll() {
		return logsdao.listAll();
	}
	
}
