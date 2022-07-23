package eTrade.business.abstracts;

import java.util.List;

import eTrade.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(User user);
	void registerWithGoogle(User user);
	void loginWithGoogle(User user);
	void delete(User user);
	void update(User user);
	List<User> getAll();
	User getById(int id);
}
