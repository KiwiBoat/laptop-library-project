package be.ehb.laptopLibraryProject.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

//removed .GetMapping and replaced it with asterisk .* to import all classes
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
@ComponentScan
public class LaptopController {

	@GetMapping("/")
	public String home() {
		return "home";
	}
	
}
