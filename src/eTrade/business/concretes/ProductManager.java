package eTrade.business.concretes;

import java.util.List;

import eTrade.business.abstracts.ProductService;
import eTrade.dataAccess.concretes.hibernates.abstracts.ProductRepository;
import eTrade.entities.concretes.Product;

public class ProductManager implements ProductService{

	private ProductRepository productRepository;
	
	public ProductManager(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	@Override
	public void add(Product product) {
		if (checkIfProductNameExist(product.getName()) 
				&& checkProductUnitPrice(product)) {
			productRepository.add(product);
		}
		else {
			System.out.println("kontrol ediniz.");
		}
	}

	@Override
	public void delete(Product product) {
		productRepository.delete(product);	
	}

	@Override
	public void update(Product product) {
		productRepository.update(product);	
	}

	@Override
	public List<Product> getAll() {
		
		return productRepository.getAll();
	}

	@Override
	public Product getById(int id) {
		
		return productRepository.getById(id);
	}
	
	
	private boolean checkIfProductNameExist(String name) {
		boolean productName = true;
		for (Product item : productRepository.getAll()) {
			if (item.getName()==name) {
				productName = false;
			}
		}
		return productName;
	}
	
	private boolean checkProductUnitPrice(Product product) {
		boolean productUnitPrice = true;
		if (product.getPrice()<=0) {
			productUnitPrice = false;
		}
		return productUnitPrice;
	}
	

}
