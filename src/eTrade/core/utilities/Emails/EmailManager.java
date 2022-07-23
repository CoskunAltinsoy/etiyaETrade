package eTrade.core.utilities.Emails;

import eTrade.entities.concretes.User;

public class EmailManager implements EmailService{

	@Override
	public void sendEmail(User user) {
		System.out.println(user.getFirstName()+" your account has been approved");
		
	}

}
