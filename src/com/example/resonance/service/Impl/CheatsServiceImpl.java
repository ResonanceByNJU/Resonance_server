package com.example.resonance.service.Impl;

import com.example.resonance.service.ENUM.COLLECT_RESULT;
import com.example.resonance.service.ENUM.DELETE_RESULT;
import com.example.resonance.service.Inter.CheatsService;
import com.example.resonance.vo.CheatsListVO;
import com.example.resonance.vo.CheatsVO;
import com.example.resonance.vo.UserVO;

public class CheatsServiceImpl implements CheatsService {

	@Override
	public CheatsVO viewCheats(long cheatsID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CheatsListVO getRecommendCheatsList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CheatsListVO searchCheatsList(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public COLLECT_RESULT collectOneCheats(CheatsVO cheats, UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public COLLECT_RESULT collectMultiCheats(CheatsListVO cheatsList,
			UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DELETE_RESULT deleteOneCheats(CheatsVO cheats, UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DELETE_RESULT deleteMultiCheats(CheatsListVO cheats, UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}

}
