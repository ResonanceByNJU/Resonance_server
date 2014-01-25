package com.example.resonance.dao.Inter;

public interface DAOHelper {
	
	public void getConnection();
	
	public void closeConnection();
	
	public void closeStatement();
	
	public void closeResult();

}
