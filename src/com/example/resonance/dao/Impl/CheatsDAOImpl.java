package com.example.resonance.dao.Impl;

import java.util.ArrayList;

import com.example.resonance.dao.ENUM.COLLECT_RESULT;
import com.example.resonance.dao.ENUM.DELETE_RESULT;
import com.example.resonance.dao.Inter.CheatsDAO;
import com.example.resonance.po.CheatsPO;

public class CheatsDAOImpl implements CheatsDAO {

	@Override
	public CheatsPO getCheatsByID(long cheatsID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<CheatsPO> getMatchedCheats(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<CheatsPO> getAllCheats() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public COLLECT_RESULT collectOneCheat(long cheatID, long userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public COLLECT_RESULT collectMultiCheats(ArrayList<Long> cheatsID,
			long userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DELETE_RESULT deleteOneCheat(long cheatID, long userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DELETE_RESULT deleteMultiCheats(ArrayList<Long> cheatsID, long userID) {
		// TODO Auto-generated method stub
		return null;
	}

}
