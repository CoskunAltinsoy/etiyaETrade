package eTrade.entities.concretes;


public class Product {

	private int id;
	private String name;
	private String descripton;
	private double price;
	
	public Product() {
		super();
	}
	
	public Product(int id,String name, String description, double price) {
		this.id = id;
		this.name = name;
		this.descripton = description;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescripton() {
		return descripton;
	}

	public void setDescripton(String descripton) {
		this.descripton = descripton;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
