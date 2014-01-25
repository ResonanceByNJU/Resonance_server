package com.example.resonance.dao.Inter;

import java.util.ArrayList;

import com.example.resonance.dao.ENUM.COLLECT_RESULT;
import com.example.resonance.dao.ENUM.DELETE_RESULT;
import com.example.resonance.po.CheatsPO;

public interface CheatsDAO {
	
	public CheatsPO getCheatsByID(long cheatsID);
	
	public ArrayList<CheatsPO> getMatchedCheats(String keyword);
	
	public ArrayList<CheatsPO> getAllCheats();
	
	public COLLECT_RESULT collectOneCheat(long cheatID,long userID);
	
	public COLLECT_RESULT collectMultiCheats(ArrayList<Long> cheatsID,long userID);
	
	public DELETE_RESULT deleteOneCheat(long cheatID,long userID);
	
	public DELETE_RESULT deleteMultiCheats(ArrayList<Long> cheatsID,long userID);

}
