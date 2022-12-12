package be.ehb.laptopLibraryProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//removed .GetMapping and replaced it with asterisk .* to import all classes
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import be.ehb.laptopLibrary.service.LaptopService;
import be.ehb.laptopLibrary.service.MyLaptopListService;
import be.ehb.laptopLibraryProject.entity.Laptop;
import be.ehb.laptopLibraryProject.entity.MyLaptopList;

@Controller
public class LaptopController {

	
	 @Autowired
	 private LaptopService service;
	 
	 @Autowired
	 private MyLaptopListService myLaptopService;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/laptop_adder")
	public String laptopAdder() {
		return "laptopAdder";
	}
	
	@GetMapping("/all_laptops")
	public ModelAndView getAllLaptops() {
		List<Laptop> list = service.getAllLaptop();
//		ModelAndView m = new ModelAndView();
//		m.setViewName("laptopList");
//		m.addObject("laptop", list);
		return new ModelAndView("laptopList", "laptop", list);
	}
	
	@PostMapping("/save")
	public String addLaptop(@ModelAttribute Laptop l) {
		service.save(l);
		return "redirect:/all_laptops";
	}
	
	@GetMapping("/my_laptops")
	public String getMyLaptops(Model model) {
		List<MyLaptopList>list=myLaptopService.getAllMyLaptops();
		model.addAttribute("book", list);
		return "myLaptops";
	}
	
	@RequestMapping("/mylist/{id}")
	public String getMyList(@PathVariable("id") int id) {
		Laptop l = service.getLaptopById(id);
		MyLaptopList ml = new MyLaptopList(l.getId(), l.getBrand(), l.getModel(), l.getSerialnumber());
		myLaptopService.saveMyLaptops(ml);
		return "redirect:/my_laptops";
	}
	

}
