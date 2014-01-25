package com.example.resonance.dao.Impl;

import java.sql.Date;
import java.util.ArrayList;

import com.example.resonance.dao.ENUM.ADD_RESULT;
import com.example.resonance.dao.Inter.LogDAO;
import com.example.resonance.po.LogPO;

public class LogDAOImpl implements LogDAO {

	@Override
	public LogPO getLogByID(long logID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<LogPO> getLogsByTime(long userID, Date time) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<LogPO> getLogsByUserAndTime(long userID, long targetID,
			Date time) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<LogPO> getAllLogsByUser(long userID, long targetID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ADD_RESULT addLog(LogPO newLog, long userID, long targetID) {
		// TODO Auto-generated method stub
		return null;
	}

}
