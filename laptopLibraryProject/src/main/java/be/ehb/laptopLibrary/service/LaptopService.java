package be.ehb.laptopLibrary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import be.ehb.laptopLibrary.repository.LaptopRepository;
import be.ehb.laptopLibraryProject.entity.Laptop;

@Service
public class LaptopService {
	
	@Autowired
	private LaptopRepository lRepo;
	
	public void save(Laptop l) {
		lRepo.save(l);
	}
	
	public List<Laptop> getAllLaptop() {
		return lRepo.findAll();
	}
	
	public Laptop getLaptopById(int id) {
	return lRepo.findById(id).get();
 }
}
