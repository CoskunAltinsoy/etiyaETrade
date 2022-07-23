package eTrade.dataAccess.concretes.hibernates.concretes;

import java.util.ArrayList;
import java.util.List;

import eTrade.dataAccess.abstracts.BaseRepository;
import eTrade.dataAccess.concretes.hibernates.abstracts.ProductRepository;
import eTrade.entities.concretes.Product;

public class HibernateProductRepository implements ProductRepository{

	List<Product> products;
	
	public HibernateProductRepository() {
		this.products = new ArrayList<Product>();
	}
	
	@Override
	public void add(Product product) {
		
		this.products.add(product);	
	}

	@Override
	public void delete(Product product) {
		
		this.products.remove(getById(product.getId()));
	}

	@Override
	public void update(Product product) {
		
		Product updateProduct = getById(product.getId());
		updateProduct.setDescripton(product.getDescripton());
		updateProduct.setName(product.getName());
		updateProduct.setPrice(product.getPrice());	
		
	}

	@Override
	public List<Product> getAll() {
	
		return this.products;
	}

	@Override
	public Product getById(int id) {
		
		Product getToProduct = null;
		for (Product product : products) {
			if (product.getId() == id) {
				getToProduct = product;
			}
		}
		return getToProduct;
		
	}

}
