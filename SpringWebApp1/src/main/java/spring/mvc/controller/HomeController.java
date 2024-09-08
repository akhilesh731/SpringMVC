package spring.mvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@GetMapping("/home")
	public String home(Model model) {
		System.out.println("home_");
		model.addAttribute("name1", "Shyam");
		
		List<String> friend = new ArrayList<String>();
		friend.add("Bill");
		friend.add("Steve");
		friend.add("Mark");
		model.addAttribute("friends", friend);
		return "index";
	}
	
	//http://localhost:8080/SpringWebApp1/help
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("help_");
		ModelAndView view = new ModelAndView();
		view.addObject("name1", "Radha");
		
		LocalDateTime dateTime = LocalDateTime.now();
		view.addObject("time", dateTime);
		view.setViewName("help");
		return view;
	}
}
