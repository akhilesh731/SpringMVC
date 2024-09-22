package spring.mvc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import spring.mvc.model.Product;

@Component
public class ProductDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public void createNewProduct(Product product) {
		System.out.println("create()");
		this.hibernateTemplate.save(product);
	}
	
	public List<Product> getAllProducts() {
		System.out.println("getAll()");
		List<Product> list = this.hibernateTemplate.loadAll(Product.class);
		return list;
	}
	
	public Product getProductById(int id) {
		System.out.println("getById()");
		Product product = this.hibernateTemplate.load(Product.class, id);
		return product;
	}
	
	@Transactional
	public void deleteProduct(int id) {
		System.out.println("delete()");
		Product product = getProductById(id);
		this.hibernateTemplate.delete(product);
	}
	
}
