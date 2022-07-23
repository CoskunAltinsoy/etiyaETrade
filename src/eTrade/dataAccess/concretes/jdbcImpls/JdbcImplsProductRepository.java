package eTrade.dataAccess.concretes.jdbcImpls;

import java.util.ArrayList;
import java.util.List;

import eTrade.dataAccess.abstracts.BaseRepository;
import eTrade.entities.concretes.Product;

public class JdbcImplsProductRepository implements BaseRepository<Product>{

	 List<Product> products;
	 
	 public JdbcImplsProductRepository() {
		 products = new ArrayList<Product>();
	 }
	@Override
	public void add(Product product) {

		products.add(product);	
	}

	@Override
	public void delete(Product product) {

		products.remove(getById(product.getId()));		
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
		return products;
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
