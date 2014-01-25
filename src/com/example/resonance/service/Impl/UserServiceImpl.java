package com.example.resonance.service.Impl;

import com.example.resonance.service.ENUM.LOGIN_RESULT;
import com.example.resonance.service.ENUM.LOGOUT_RESULT;
import com.example.resonance.service.ENUM.MODIFY_RESULT;
import com.example.resonance.service.ENUM.REGISTER_RESULT;
import com.example.resonance.service.Inter.UserService;
import com.example.resonance.vo.RegisterUserVO;
import com.example.resonance.vo.UserVO;

public class UserServiceImpl implements UserService {

	@Override
	public LOGIN_RESULT login(String userID, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LOGOUT_RESULT logout(UserVO logoutUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public REGISTER_RESULT registerUser(RegisterUserVO registerUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MODIFY_RESULT modifyProfile(UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MODIFY_RESULT setInterests(UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}

}
