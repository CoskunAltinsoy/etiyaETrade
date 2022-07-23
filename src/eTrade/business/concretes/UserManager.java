package eTrade.business.concretes;

import java.util.List;
import java.util.regex.Pattern;

import eTrade.business.abstracts.UserService;
import eTrade.core.utilities.Emails.EmailService;
import eTrade.core.utilities.adapters.abstracts.GoogleCheckService;
import eTrade.dataAccess.concretes.hibernates.abstracts.UserRepository;
import eTrade.entities.concretes.User;

public class UserManager implements UserService {

	private UserRepository userRepository;
	private EmailService emailService;
	private GoogleCheckService googleCheckService;
	
	public UserManager(UserRepository userRepository, EmailService emailService,
			GoogleCheckService googleCheckService) {
		this.userRepository = userRepository;
		this.emailService = emailService;
		this.googleCheckService = googleCheckService;
	}
	
	@Override
	public void register(User user) {
		if (checkEmailFormat(user.getEmail()) && checkPassword(user.getPassword()) &&
				checkIfUserEmailExist(user.getEmail())) {
			this.userRepository.add(user);
			this.emailService.sendEmail(user);
			System.out.println("registered is successful");
		}	else {
			System.out.println("please check your email or password");
		}
	}
	
	@Override
	public void login(User user) {
		if (!checkIfUserEmailExist(user.getEmail())) {
			System.out.println("login successful");
		}else {
			System.out.println("make sure you are logged is correctly");
		}	
	}
	
	@Override
	public void registerWithGoogle(User user) {
		this.googleCheckService.RegisterWithGoogle(user);
		
	}

	@Override
	public void loginWithGoogle(User user) {
		this.googleCheckService.LoginWithGoogle(user);
		
	}

	@Override
	public void delete(User user) {
		this.userRepository.delete(user);
		
	}

	@Override
	public void update(User user) {
		this.userRepository.update(user);
		
	}

	@Override
	public List<User> getAll() {
		return this.userRepository.getAll();
	}

	@Override
	public User getById(int id) {
		return this.userRepository.getById(id);
	}
	
	private boolean checkIfUserEmailExist(String email) {
		boolean userEmail = true;
		for (User item : userRepository.getAll()) {
			if (item.getEmail() == email) {
				userEmail = false;
			}
		}
		return userEmail;
	}
	
	private boolean checkEmailFormat(String email) {
		String regexPattern = "^(.+)@(\\S+)$";
		return Pattern.compile(regexPattern).matcher(email).matches();
	}
	
	private boolean checkPassword(String password) {
		if (password.length() < 6) {
			return false;
		}
		return true;
	}

	

}
