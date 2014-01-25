package com.example.resonance.dao.Inter;

import java.sql.Date;
import java.util.ArrayList;

import com.example.resonance.dao.ENUM.ADD_RESULT;
import com.example.resonance.po.LogPO;

public interface LogDAO {
	
	public LogPO getLogByID(long logID);
	
	public ArrayList<LogPO> getLogsByTime(long userID,Date time);
	
	public ArrayList<LogPO> getLogsByUserAndTime(long userID,long targetID,Date time);
	
	public ArrayList<LogPO> getAllLogsByUser(long userID,long targetID);
	
	public ADD_RESULT addLog(LogPO newLog,long userID,long targetID);

}
