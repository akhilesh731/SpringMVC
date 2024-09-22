package spring.mvc.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import jakarta.servlet.http.HttpServletRequest;
import spring.mvc.dao.ProductDao;
import spring.mvc.model.Product;

@Controller
public class MainController {
	@Autowired
	private ProductDao productDao;
	
	@RequestMapping("/")
	public String home(Model model) {
		System.out.println("home_");
		//List<Product> products = productDao.getAllProducts();
		//model.addAttribute("products", products);
		return "index";
	}
	
	@RequestMapping("/add-product")
	public String addProduct() {
		System.out.println("addProduct_");
		return "product_page";
	}
	
	@RequestMapping(value = "/handle-product", method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product, HttpServletRequest request) {
		System.out.println("handleProduct_");
		System.out.println(product);
		productDao.createNewProduct(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
}
