package eTrade.dataAccess.concretes.hibernates.concretes;

import java.util.ArrayList;
import java.util.List;

import eTrade.dataAccess.abstracts.BaseRepository;
import eTrade.dataAccess.concretes.hibernates.abstracts.UserRepository;
import eTrade.entities.concretes.User;

public class HibernateUserRepository implements UserRepository{

	List<User> users;
	
	public HibernateUserRepository() {
		super();
		this.users = new ArrayList<User>();
	}

	@Override
	public void add(User user) {
		this.users.add(user);	
	}

	@Override
	public void delete(User user) {
		this.users.remove(getById(user.getId()));
		
	}

	@Override
	public void update(User user) {
		User updateUser = getById(user.getId());
		updateUser.setFirstName(user.getFirstName());
		updateUser.setLastName(user.getLastName());
		updateUser.setNationaIdentity(user.getNationaIdentity());
		updateUser.setEmail(user.getEmail());
		updateUser.setPassword(user.getPassword());
		
	}

	@Override
	public List<User> getAll() {
		
		return this.users;
	}

	@Override
	public User getById(int id) {
		User getToUser = null;
		for (User user : users) {
			if (user.getId() == id) {
				getToUser = user;
			}
		}
		return getToUser;
	}

}
