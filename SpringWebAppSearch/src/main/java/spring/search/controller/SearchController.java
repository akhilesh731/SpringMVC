package spring.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("home_");
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("queryBox") String query) {
		System.out.println("search_");
		if(query.isEmpty()) {
			throw new NullPointerException();
		}
		String url = "https://www.google.com/search?q="+query;
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
	}
	
	@ExceptionHandler(value = Exception.class)
	public String myExceptionHandler() {
		System.out.println("myExceptionHandler_");
		return "errorPage";
	}
}
