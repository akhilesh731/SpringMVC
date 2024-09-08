package spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import spring.mvc.model.User;
import spring.mvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/contact")
	public String showForm() {
		System.out.println("showForm_");
		return "contact";
	}

//	  public String handleForm(HttpServletRequest request) {
//		  System.out.println("handleForm_"); 
//		  String email = request.getParameter("email"); 
//		  System.out.println(email); 
//	  return "contact"; 
//	  }
	 
	@RequestMapping("/processform")
	public String handleForm(
			@RequestParam(value = "email", defaultValue = "default@gmail.com") String email, 
			@RequestParam(value = "username", required = false) String name,
			@RequestParam("password") String password, Model model) {
		System.out.println("handleForm_");
		
//		System.out.println(email+", "+name+", "+password);
//		model.addAttribute("email", email);
//		model.addAttribute("username", name);
//		model.addAttribute("password", password);
		
		User user = new User();
		user.setEmail(email);
		user.setUsername(name);
		user.setPassword(password);
		System.out.println(user);
		model.addAttribute("user", user);
		return "success";
	}
	
	@RequestMapping("/processform1")
	public String handleFormNew(@ModelAttribute User user, Model model) {
		System.out.println("handleFormNew_");
		System.out.println(user);
		int i = this.userService.createUser(user);
		System.out.println("user saved! "+i);
		return "success";
	}
}
