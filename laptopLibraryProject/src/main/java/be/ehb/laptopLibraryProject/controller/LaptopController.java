package be.ehb.laptopLibraryProject.controller;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//removed .GetMapping and replaced it with asterisk .* to import all classes
import org.springframework.web.bind.annotation.*;

import be.ehb.laptopLibrary.service.LaptopService;
import be.ehb.laptopLibraryProject.entity.Laptop;


@Controller
public class LaptopController {

//	@Autowired
//	private LaptopService service;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/laptop_adder")
	public String laptopAdder() {
		return "laptopAdder";
	}
	
	@GetMapping("/all_laptops")
	public String allLaptops() {
		return "allLaptops";
	}
	
	
//	@PostMapping("/save")
//	public String addLaptop(@ModelAttribute Laptop l) {
//		service.save(l);
//		return "redirect:/all_laptops";
//	}
}
