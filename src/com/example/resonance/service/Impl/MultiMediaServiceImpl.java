package com.example.resonance.service.Impl;

import com.example.resonance.service.ENUM.CANCEL_RESULT;
import com.example.resonance.service.ENUM.SEND_RESULT;
import com.example.resonance.service.Inter.MultiMediaService;
import com.example.resonance.vo.AudioVO;
import com.example.resonance.vo.UserVO;
import com.example.resonance.vo.VideoVO;

public class MultiMediaServiceImpl implements MultiMediaService {

	@Override
	public SEND_RESULT sendAudioToSingle(AudioVO audio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SEND_RESULT sendVedioToSingle(VideoVO vedio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SEND_RESULT sendAudioToMulti(AudioVO audio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SEND_RESULT sendVedioToMulti(VideoVO vedio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CANCEL_RESULT cancelSendAudio(AudioVO audio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AudioVO checkAudio(UserVO receiver) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VideoVO checkVideo(UserVO receiver) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SEND_RESULT resumeBreadTransfer(UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}

}
