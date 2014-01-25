package com.example.resonance.dao.Impl;

import java.util.ArrayList;

import com.example.resonance.dao.ENUM.ADD_RESULT;
import com.example.resonance.dao.Inter.QuestionDAO;
import com.example.resonance.po.QuestionPO;

public class QuestionDAOImpl implements QuestionDAO {

	@Override
	public QuestionPO getQuestionByID(long questionID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<QuestionPO> getQuestionByKeyword(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ADD_RESULT addQuestionCookie(long userID, long questionID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ADD_RESULT addMultiQuestionCookies(long userID,
			ArrayList<Long> questionIDList) {
		// TODO Auto-generated method stub
		return null;
	}

}
