package com.example.resonance.dao.Inter;

import java.util.ArrayList;

import com.example.resonance.dao.ENUM.ADD_RESULT;
import com.example.resonance.dao.ENUM.LOGIN_RESULT;
import com.example.resonance.dao.ENUM.LOGOUT_RESULT;
import com.example.resonance.dao.ENUM.MODIFY_RESULT;
import com.example.resonance.po.UserPO;

public interface UserDAO {
	
	public LOGIN_RESULT login(String username,String password);
	
	public LOGOUT_RESULT logout(long userID);
	
	public ADD_RESULT register(UserPO newUser);
	
	public MODIFY_RESULT modifyUser(UserPO modifyUser);
	
	public ArrayList<UserPO> getHRMatcher(UserPO uesr,double heartrate);
	
	public ADD_RESULT addOneFellow(long userID,long fellowID);
	
	public ADD_RESULT addMultiFellow(long userID,ArrayList<Long> fellowIDList);

}
