package be.ehb.laptopLibraryProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Combination of the 3 annotations: Configuration, EnableAutoConfiguration and ComponentScan
// @SpringBootApplication
@ComponentScan(basePackages = {"be.ehb.laptopLibraryProjectApplication"})
@Configuration
@EnableAutoConfiguration

public class LaptopLibraryProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaptopLibraryProjectApplication.class, args);
	}

}
