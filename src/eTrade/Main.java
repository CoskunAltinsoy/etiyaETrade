package eTrade;

import eTrade.business.abstracts.ProductService;
import eTrade.business.abstracts.UserService;
import eTrade.business.concretes.ProductManager;
import eTrade.business.concretes.UserManager;
import eTrade.core.utilities.Emails.EmailManager;
import eTrade.core.utilities.adapters.concretes.GoogleServiceAdapter;
import eTrade.dataAccess.concretes.hibernates.concretes.HibernateProductRepository;
import eTrade.dataAccess.concretes.hibernates.concretes.HibernateUserRepository;
import eTrade.dataAccess.concretes.jdbcImpls.JdbcImplsProductRepository;
import eTrade.entities.concretes.Product;
import eTrade.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Product product1 = new Product(1, "Bilgisayar", "Asus Bilgisayar", 10000);
//		Product product2 = new Product(2, "Klavye    ", "Logitech Klavye", 1000);
//		Product product3 = new Product(3, "PS4       ", "Sony PS4       ", 12000);
//		Product product4 = new Product(4, "Mause     ", "Logitech Mause ", 800);
//		Product product5 = new Product(5, "Tablet    ", "Samsung Tablet ", 4000);
//		Product product6 = new Product(6, "Süpürge   ", "Bosh Süpürge   ", 4000);
		
//		ProductService productService = new ProductManager(new HibernateProductRepository());
//		productService.add(product1);
//		productService.add(product2);
//		productService.add(product3);
//		productService.add(product4);
//		productService.add(product5);
//		productService.add(product6);
//		productService.delete(product6);
		
//		for (Product item : productService.getAll()) {
//			System.out.println(item.getId()+") "+ item.getName()+" "+item.getDescripton()+" "+
//		                       item.getPrice());
//		}
		
		User user1 = new User(1, "Mücahit Coşkun", "Altınsoy","1212331231","coskun.altinsoyy@gmail.com","134156");
		User user2 = new User(1, "Mücahit Coşkun", "Altınsoy","1212331231","coskun.altinsoyy@gmail.com","137456");
		UserService userService = new UserManager(new HibernateUserRepository(), new EmailManager(), new GoogleServiceAdapter());
		userService.register(user1);
		userService.register(user2);
		//userService.registerWithGoogle(user1);

	}

}
