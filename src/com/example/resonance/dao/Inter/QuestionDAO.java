package com.example.resonance.dao.Inter;

import java.util.ArrayList;

import com.example.resonance.dao.ENUM.ADD_RESULT;
import com.example.resonance.po.QuestionPO;

public interface QuestionDAO {
	
	public QuestionPO getQuestionByID(long questionID);
	
	public ArrayList<QuestionPO> getQuestionByKeyword(String keyword);
	
	public ADD_RESULT addQuestionCookie(long userID,long questionID);
	
	public ADD_RESULT addMultiQuestionCookies(long userID,ArrayList<Long> questionIDList);

}
