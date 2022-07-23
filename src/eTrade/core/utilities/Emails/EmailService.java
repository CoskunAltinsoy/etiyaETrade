package eTrade.core.utilities.Emails;

import eTrade.entities.concretes.User;

public interface EmailService {

	public void sendEmail(User user);
}
