package eTrade.core.utilities.adapters.concretes;

import eTrade.core.utilities.adapters.abstracts.GoogleCheckService;
import eTrade.entities.concretes.User;

public class GoogleServiceAdapter implements GoogleCheckService{

	
	@Override
	public void RegisterWithGoogle(User user) {
		System.out.println(user.getEmail()+" Registered with google");
		
	}

	@Override
	public void LoginWithGoogle(User user) {
		System.out.println(user.getEmail()+" Logged with google");
		
	}

}
