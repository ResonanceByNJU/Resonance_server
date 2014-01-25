package com.example.resonance.dao.Impl;

import java.util.ArrayList;

import com.example.resonance.dao.ENUM.ADD_RESULT;
import com.example.resonance.dao.ENUM.LOGIN_RESULT;
import com.example.resonance.dao.ENUM.LOGOUT_RESULT;
import com.example.resonance.dao.ENUM.MODIFY_RESULT;
import com.example.resonance.dao.Inter.UserDAO;
import com.example.resonance.po.UserPO;

public class UserDAOImpl implements UserDAO {

	@Override
	public LOGIN_RESULT login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LOGOUT_RESULT logout(long userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ADD_RESULT register(UserPO newUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MODIFY_RESULT modifyUser(UserPO modifyUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<UserPO> getHRMatcher(UserPO uesr, double heartrate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ADD_RESULT addOneFellow(long userID, long fellowID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ADD_RESULT addMultiFellow(long userID, ArrayList<Long> fellowIDList) {
		// TODO Auto-generated method stub
		return null;
	}

}
