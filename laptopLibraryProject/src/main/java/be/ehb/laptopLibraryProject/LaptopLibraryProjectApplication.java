package be.ehb.laptopLibraryProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Combination of the 3 annotations: Configuration, EnableAutoConfiguration and ComponentScan
@SpringBootApplication
public class LaptopLibraryProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaptopLibraryProjectApplication.class, args);
	}

}
