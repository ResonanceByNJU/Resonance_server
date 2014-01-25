package com.example.resonance.dao.Inter;

import com.example.resonance.dao.ENUM.ADD_RESULT;
import com.example.resonance.dao.ENUM.DELETE_RESULT;
import com.example.resonance.dao.ENUM.FINISH_RESULT;
import com.example.resonance.po.AudioPO;
import com.example.resonance.po.VideoPO;

public interface MultiMediaDAO {
	
	public AudioPO getAudioByID(long audioID);
	
	public VideoPO getVideoByID(long videoID);
	
	public ADD_RESULT addMedia(String filePath);
	
	public FINISH_RESULT finishTransfer(long mediaID);
	
	public DELETE_RESULT deleteMedia(long mediaID);

}
