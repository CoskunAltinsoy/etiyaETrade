package eTrade.core.utilities.adapters.abstracts;

import eTrade.entities.concretes.User;

public interface GoogleCheckService {

	public void RegisterWithGoogle(User user);
	public void LoginWithGoogle(User user);
		

}
