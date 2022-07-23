package eTrade.entities.concretes;

public class User {

	private int id;
	private String firstName;
	private String lastName;
	private String nationaIdentity;
	private String email;
	private String password;	
	
	

	public User() {
		super();
	}

	public User(int id, String firstName, String lastName, String nationaIdentity, String email, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationaIdentity = nationaIdentity;
		this.email = email;
		this.password = password;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationaIdentity() {
		return nationaIdentity;
	}

	public void setNationaIdentity(String nationaIdentity) {
		this.nationaIdentity = nationaIdentity;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
