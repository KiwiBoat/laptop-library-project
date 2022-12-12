package be.ehb.laptopLibrary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.ehb.laptopLibrary.repository.LaptopRepository;
import be.ehb.laptopLibraryProject.entity.Laptop;

@Service
public class LaptopService {
	
	@Autowired
	private LaptopRepository lRepo;
	public void save (Laptop l) {
		lRepo.save(l);
	}
}
